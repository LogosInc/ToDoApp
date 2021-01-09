package com.example.todoapp.fragments.list

import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView

abstract class SwipetoDelete: ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {
    // Need override both onMove and onSwipe mathod, otherwise have Error issue
    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        // Only need swipe, so return false
        return false
    }

    // Deleted after add swipeToDelete in ListFragment
    /*override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
        TODO("Not yet implemented")
    }*/
}