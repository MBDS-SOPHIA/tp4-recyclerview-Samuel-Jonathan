package com.openclassrooms.magicgithub.ui.user_list

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.openclassrooms.magicgithub.databinding.ItemListUserBinding
import com.openclassrooms.magicgithub.model.User

class ListUserViewHolder(
    private val binding: ItemListUserBinding // Binding pour accéder aux vues
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(user: User, callback: UserListAdapter.Listener) {
        // Charger l'image avec Glide
        Glide.with(binding.root.context)
            .load(user.avatarUrl)
            .apply(RequestOptions.circleCropTransform())
            .into(binding.itemListUserAvatar) // Utilisation de ViewBinding

        // Définir le nom d'utilisateur
        binding.itemListUserUsername.text = user.login

        // Appliquer la couleur d'arrière-plan en fonction de l'état actif/inactif
        binding.root.setBackgroundColor(
            if (user.isActive) android.graphics.Color.WHITE else android.graphics.Color.RED
        )

        // Gérer l'événement de suppression
        binding.itemListUserDeleteButton.setOnClickListener {
            callback.onClickDelete(user)
        }
    }
}
