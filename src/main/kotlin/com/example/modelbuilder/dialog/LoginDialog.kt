package com.example.modelbuilder.dialog

import com.intellij.openapi.ui.DialogWrapper
import javax.swing.JComponent
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JTextField
import javax.swing.JPasswordField

class LoginDialog : DialogWrapper(true) {

    private val usernameField = JTextField(20)
    private val passwordField = JPasswordField(20)

    init {
        title = "BizMOB Login"
        init()
    }

    override fun createCenterPanel(): JComponent? {
        val panel = JPanel()
        panel.add(JLabel("Username:"))
        panel.add(usernameField)
        panel.add(JLabel("Password:"))
        panel.add(passwordField)
        return panel
    }

    override fun doOKAction() {
        val username = usernameField.text
        val password = String(passwordField.password)

        // 여기에서 Retrofit2를 사용하여 로그인 요청을 보낼 수 있습니다.

        close(0)
    }
}