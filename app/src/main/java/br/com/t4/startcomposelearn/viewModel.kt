package br.com.t4.startcomposelearn

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class AppViewModel: ViewModel() {

    private val _loginName = MutableStateFlow("")
    val loginName get() = _loginName

    private val _loginPassword = MutableStateFlow("")
    val loginPassword get() = _loginPassword

    private val _listWidgetsCards = MutableStateFlow(
        listOf("Credito", "Profile", "Cartão")
    )
    val listWidgetsCards get() = _listWidgetsCards

    fun setLoginName(text: String) {
        _loginName.value = text
    }

    fun setLoginPassword(text: String) {
        _loginPassword.value = text
    }

    fun onLogin() = loginPassword.value == "teste123"
}