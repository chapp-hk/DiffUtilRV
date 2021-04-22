package com.example.diffutilrv.employee.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.diffutilrv.employee.data.DummyEmployeeDataUtils

class EmployeeViewModel : ViewModel() {

    private val _list = MutableLiveData<List<EmployeeListItem>>()
    val list: LiveData<List<EmployeeListItem>> = _list

    fun sortByName() {
        _list.value = DummyEmployeeDataUtils.employeeListSortedByName.map { it.toListItem() }
    }

    fun sortByRole() {
        _list.value = DummyEmployeeDataUtils.employeeListSortedByRole.map { it.toListItem() }
    }
}