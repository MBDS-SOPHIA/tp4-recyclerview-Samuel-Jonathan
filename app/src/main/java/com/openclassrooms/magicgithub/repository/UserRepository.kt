package com.openclassrooms.magicgithub.repository

import com.openclassrooms.magicgithub.api.ApiService
import com.openclassrooms.magicgithub.model.User

class UserRepository(
    private val apiService: ApiService
) {
    fun getUsers(): List<User> {
        // Implémentation : Retourne la liste des utilisateurs
        return apiService.getUsers()
    }

    fun addRandomUser() {
        // Implémentation : Ajoute un utilisateur aléatoire
        apiService.addRandomUser()
    }

    fun deleteUser(user: User) {
        // Implémentation : Supprime un utilisateur
        apiService.deleteUser(user)
    }
}
