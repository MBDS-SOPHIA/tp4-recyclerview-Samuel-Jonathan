package com.openclassrooms.magicgithub.api

import com.openclassrooms.magicgithub.model.User

class FakeApiService : ApiService {
    private val _users = FakeApiServiceGenerator.FAKE_USERS

    override fun getUsers(): List<User> {
        // Implémentation : Retourne la liste des utilisateurs
        return _users
    }

    override fun addRandomUser() {
        // Implémentation : Ajoute un utilisateur aléatoire
        val randomUser = FakeApiServiceGenerator.FAKE_USERS_RANDOM.random()
        _users.add(randomUser)
    }

    override fun deleteUser(user: User) {
        // Implémentation : Supprime un utilisateur
        _users.remove(user)
    }
}
