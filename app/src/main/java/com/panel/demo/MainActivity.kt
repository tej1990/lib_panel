package com.panel.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.panel.demo.databinding.ActivityMainBinding
import com.tappp.library.view.OverlayPanelLayout
import com.tappp.library.view.PanelLayout

class MainActivity : AppCompatActivity(), OverlayPanelLayout.DataListener {
    private var binding: ActivityMainBinding? = null
    //private lateinit var overlayPanelLayout: OverlayPanelLayout
    //private lateinit var overlayPanelLayout: PanelLayout
    private lateinit var overlayPanelLayout: OverlayPanelLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

        overlayPanelLayout = OverlayPanelLayout(this)
        //overlayPanelLayout = PanelLayout(this)
        //overlayPanelLayout.init(binding!!.fragmentContainer)


        overlayPanelLayout.init(this, supportFragmentManager, R.id.fragment_container)


        //overlayPanelLayout.start()

        //overlayPanelLayout.subscribe(this)
    }

    override fun onDataReceived(call: String?, result: Any?) {

    }

}