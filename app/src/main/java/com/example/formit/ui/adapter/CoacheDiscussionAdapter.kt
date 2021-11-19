package com.example.formit.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.marginTop
import androidx.recyclerview.widget.RecyclerView
import com.example.formit.R
import com.example.formit.data.model.Coache_Discussion
import kotlinx.android.synthetic.main.item_coache_discussion.view.*



class CoacheDiscussionAdapter(var CoachesDiscussion : MutableList<Coache_Discussion>) :
    RecyclerView.Adapter<CoacheDiscussionAdapter.CoacheDiscussionViewHolder>() {

    inner class CoacheDiscussionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoacheDiscussionViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_coache_discussion, parent, false)
        return CoacheDiscussionViewHolder(view)
    }

    override fun onBindViewHolder(holder: CoacheDiscussionViewHolder, position: Int) {
        holder.itemView.apply {
            CoacheDiscussionPic.setImageResource(CoachesDiscussion[position].CoacheDiscussionPic)
            CoacheDiscussionName.text = CoachesDiscussion[position].CoacheDiscussionName
            CoacheDiscussionLastMessage.text = CoachesDiscussion[position].CoacheDiscussionLastMessage
            CoacheDiscussionTime.text = CoachesDiscussion[position].CoacheDiscussionTime
            CoacheDiscussionUnreaded.text = CoachesDiscussion[position].CoacheDiscussionUnreaded.toString()
            if (position == CoachesDiscussion.size - 1) {
                SeparatorCoacheDiscussion.visibility = View.GONE
            }
            if (position == 0) {
                item_Coache_Discussion.marginTop.countLeadingZeroBits()
            }
        }
    }

    override fun getItemCount(): Int = CoachesDiscussion.size
}