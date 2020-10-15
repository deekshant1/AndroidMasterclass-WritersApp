package com.example.writersapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text2);
        String para = "Components cover a range of interface needs, including:\n" +
                "\n" +
                "    Display: Placing and organizing content using components like cards, lists, and sheets.\n" +
                "    Navigation: Allowing users to move through the product using components like navigation drawers and tabs.\n" +
                "    Actions: Allowing users to perform tasks using components such as the floating action button.\n" +
                "    Input: Allowing users to enter information or make selections using components like text fields, chips, and selection controls.\n" +
                "    Communication: Alerting users to key information and messages using components such as snackbars, banners, and dialogs.\n" +
                "\n" +
                "Resources\n" +
                "\n" +
                "    Component guidelines covering usage, behaviors, and specifications\n" +
                "    Developer documentation and code for Android, iOS, the web, and Flutter\n" +
                "    Downloadable design files for Figma on the Resources pageComponents cover a range of interface needs, including:\n" +
                "\n" +
                "    Display: Placing and organizing content using components like cards, lists, and sheets.\n" +
                "    Navigation: Allowing users to move through the product using components like navigation drawers and tabs.\n" +
                "    Actions: Allowing users to perform tasks using components such as the floating action button.\n" +
                "    Input: Allowing users to enter information or make selections using components like text fields, chips, and selection controls.\n" +
                "    Communication: Alerting users to key information and messages using components such as snackbars, banners, and dialogs.\n" +
                "\n" +
                "Resources\n" +
                "\n" +
                "    Component guidelines covering usage, behaviors, and specifications\n" +
                "    Developer documentation and code for Android, iOS, the web, and Flutter\n" +
                "    Downloadable design files for Figma on the Resources pageComponents cover a range of interface needs, including:\n" +
                "\n" +
                "    Display: Placing and organizing content using components like cards, lists, and sheets.\n" +
                "    Navigation: Allowing users to move through the product using components like navigation drawers and tabs.\n" +
                "    Actions: Allowing users to perform tasks using components such as the floating action button.\n" +
                "    Input: Allowing users to enter information or make selections using components like text fields, chips, and selection controls.\n" +
                "    Communication: Alerting users to key information and messages using components such as snackbars, banners, and dialogs.\n" +
                "\n" +
                "Resources\n" +
                "\n" +
                "    Component guidelines covering usage, behaviors, and specifications\n" +
                "    Developer documentation and code for Android, iOS, the web, and Flutter\n" +
                "    Downloadable design files for Figma on the Resources pageComponents cover a range of interface needs, including:\n" +
                "\n" +
                "    Display: Placing and organizing content using components like cards, lists, and sheets.\n" +
                "    Navigation: Allowing users to move through the product using components like navigation drawers and tabs.\n" +
                "    Actions: Allowing users to perform tasks using components such as the floating action button.\n" +
                "    Input: Allowing users to enter information or make selections using components like text fields, chips, and selection controls.\n" +
                "    Communication: Alerting users to key information and messages using components such as snackbars, banners, and dialogs.\n" +
                "\n" +
                "Resources\n" +
                "\n" +
                "    Component guidelines covering usage, behaviors, and specifications\n" +
                "    Developer documentation and code for Android, iOS, the web, and Flutter\n" +
                "    Downloadable design files for Figma on the Resources page";
        textView.setText(para);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}