package com.example.timetrackerapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [task_execute.newInstance] factory method to
 * create an instance of this fragment.
 */
class task_execute() : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val positionkey = arguments?.getInt("positionkey", -1) ?: -1
        if (positionkey != -1) {
            // Use the position ID as needed
            Log.d("TaskExecuteFragment", "Position: $positionkey")


        }
        val TaskName = arguments?.getString("TaskName", null) ?: -1
        if (TaskName != -1) {
            // Use the position ID as needed
            Log.d("TaskExecuteFragment", "TaskName: $TaskName")


        }



        return inflater.inflate(R.layout.fragment_task_execute, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment task_execute.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic fun newInstance() =
                task_execute().apply {
                    arguments = Bundle().apply {

                    }
                }
    }
}