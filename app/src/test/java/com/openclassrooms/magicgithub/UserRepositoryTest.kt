package com.openclassrooms.magicgithub

import com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS
import com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS_RANDOM
import com.openclassrooms.magicgithub.di.Injection
import com.openclassrooms.magicgithub.model.User
import com.openclassrooms.magicgithub.repository.UserRepository
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import java.util.Collections

/**
 * Unit test, which will execute on a JVM.
 * Testing UserRepository.
 */
@RunWith(JUnit4::class)
class UserRepositoryTest {
    private lateinit var userRepository: UserRepository

    @Before
    fun setup() {
        userRepository = Injection.getRepository()
    }

    @Test
    fun getUsersWithSuccess() {
        val usersActual = userRepository.getUsers()
        val usersExpected: List<User> = FAKE_USERS
        assertEquals(
            usersActual,
            usersExpected
        )
    }

    @Test
    fun generateRandomUserWithSuccess() {
        val initialSize = userRepository.getUsers().size
        userRepository.addRandomUser()
        val user = userRepository.getUsers().last()
        assertEquals(userRepository.getUsers().size, initialSize + 1)
        assertTrue(
            FAKE_USERS_RANDOM.filter {
                it.equals(user)
            }.isNotEmpty()
        )
    }

    @Test
    fun deleteUserWithSuccess() {
        val userToDelete = userRepository.getUsers()[0]
        userRepository.deleteUser(userToDelete)
        Assert.assertFalse(userRepository.getUsers().contains(userToDelete))
    }

    @Test
    fun toggleUserStatusWithSuccess() {
        val user = userRepository.getUsers()[0]
        val initialStatus = user.isActive
        userRepository.toggleUserStatus(user)
        assertNotEquals(initialStatus, user.isActive)
    }

    @Test
    fun swapItemsWithSuccess() {
        val initialList = userRepository.getUsers().toMutableList()
        val firstUser = initialList[0]
        val secondUser = initialList[1]

        Collections.swap(initialList, 0, 1)
        assertEquals(secondUser, initialList[0])
        assertEquals(firstUser, initialList[1])
    }

}