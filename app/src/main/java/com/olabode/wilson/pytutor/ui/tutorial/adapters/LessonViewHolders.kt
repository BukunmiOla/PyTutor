package com.olabode.wilson.pytutor.ui.tutorial.adapters

import android.content.Context
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.olabode.wilson.pytutor.databinding.ItemBulletTextBinding
import com.olabode.wilson.pytutor.databinding.ItemCodeSnippetBinding
import com.olabode.wilson.pytutor.databinding.ItemTutorialBodyBinding
import com.olabode.wilson.pytutor.models.tutorial.Tutorial
import com.olabode.wilson.pytutor.views.PythonSyntaxManager

/**
 *   Created by OLABODE WILSON on 9/9/20.
 */

class CodeViewHolder(val binding: ItemCodeSnippetBinding, context: Context) : RecyclerView.ViewHolder(binding.root) {

    init {
        PythonSyntaxManager.applyMonokaiTheme(context, binding.codeView)
    }

    fun bind(item: Tutorial) {
        item.codeSnippet?.let { code ->
            binding.codeView.setText(code.code)

            if (code.header.isNotEmpty()) {
                binding.header.text = code.header
                binding.header.isVisible = true
            } else {
                binding.header.isVisible = false
            }

            if (code.footer.isNotEmpty()) {
                binding.footer.text = code.footer
                binding.footer.isVisible = true
            } else {
                binding.footer.isVisible = false
            }
        }
    }
}

class TextViewHolder(val binding: ItemTutorialBodyBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Tutorial) {
        item.body.let {
            binding.bodyText.text = it
        }
    }
}

class BulletViewHolder(val binding: ItemBulletTextBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Tutorial) {
        item.body.let {
            binding.text.text = it
        }
    }
}

enum class LessonTypes {
    CODE, TEXT, IMAGE, BULLET
}