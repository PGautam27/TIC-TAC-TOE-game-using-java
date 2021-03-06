<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center"
    android:background="@drawable/background"
    tools:context=".AddPlayers">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textColor="#514D4D"
        android:textSize="30sp"
        android:gravity="center"
        android:text="Enter player Name"
        android:textStyle="bold"/>
    <LinearLayout
        android:gravity="center_vertical"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:layout_marginStart="20dp"
        android:layout_marginEnd="20dp"
        android:background="@color/grey"
        android:layout_marginTop="50dp"
        android:orientation="horizontal">
        <ImageView
            android:layout_marginStart="20dp"
            android:layout_width="30dp"
            android:layout_height="30dp"
            android:src="@drawable/cross_icon"
            android:adjustViewBounds="true"/>
        <EditText
            android:inputType="text"
            android:maxLines="1"
            android:id="@+id/playerOneName"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginStart="20dp"
            android:layout_marginEnd="20dp"
            android:background="@color/dark_grey"
            android:hint="Player one"
            android:textColorHint="@color/light_white"
            android:textColor="#FFFFFFFF"/>
    </LinearLayout>
    <LinearLayout
        android:gravity="center_vertical"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:layout_marginStart="20dp"
        android:layout_marginEnd="20dp"
        android:background="@color/grey"
        android:layout_marginTop="50dp"
        android:orientation="horizontal">
        <ImageView
            android:layout_marginStart="20dp"
            android:layout_width="30dp"
            android:layout_height="30dp"
            android:src="@drawable/zero"
            android:adjustViewBounds="true"/>
        <EditText
            android:inputType="text"
            android:maxLines="1"
            android:id="@+id/playerTwoName"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginStart="20dp"
            android:layout_marginEnd="20dp"
            android:background="@color/dark_grey"
            android:hint="Player two"
            android:textColorHint="@color/light_white"
            android:textColor="#FFFFFFFF"/>
    </LinearLayout>
    <androidx.appcompat.widget.AppCompatButton
        android:id="@+id/startGameBtn"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginStart="20dp"
        android:layout_marginEnd="20dp"
        android:layout_marginTop="40dp"
        android:text="Start Game"
        android:textColor="#D3CCCC"
        android:background="@drawable/round_black_grey"/>
</LinearLayout>
