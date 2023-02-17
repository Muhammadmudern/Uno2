package com.example.uno2

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import me.dm7.barcodescanner.zbar.Result
import me.dm7.barcodescanner.zbar.ZBarScannerView


var returnQRCode: MutableList<String> = arrayListOf()
class QRScanner : AppCompatActivity(), ZBarScannerView.ResultHandler {
    private lateinit var zbView: ZBarScannerView
    lateinit var  resualtQR: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        HideActionBar()
        zbView = ZBarScannerView(this)
        setContentView(zbView)
    }

    // Остоновлять или запускать камеру учитывая в каком цикле жизни мы работаем
    override fun onPause() {
        super.onPause()
        zbView.stopCamera()
    }

    override fun onResume() {
        super.onResume()
        zbView.setResultHandler(this)
        zbView.startCamera()
    }


    // приходит результат сканирования QR
    override fun handleResult(result: Result?) {
        resualtQR = result?.contents.toString()
        returnQRCode.add(0,"0")
        returnQRCode.add(1,"0")
        returnQRCode.add(2,"0")
        returnQRCode.add(3,"0")
        getTruthCode(returnQRCode.toString())
        val myintent: Intent =  Intent(
            this, PasswordPage::class.java)
            .putExtra("<QrCode>", returnQRCode.toString())
        startActivity(myintent)

        finish()
    }
    fun getTruthCode (returnQRcode: String): String{
        return returnQRcode
    }

    private fun HideActionBar() {
        supportActionBar?.hide()
    }
}