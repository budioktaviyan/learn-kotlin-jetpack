package id.kotlin.declarative

import android.app.Application
import android.util.Log

class DeclarativeApp : Application() {

  override fun onCreate() {
    super.onCreate()
    Log.d(DeclarativeApp::class.java.simpleName, "onCreate")
  }
}