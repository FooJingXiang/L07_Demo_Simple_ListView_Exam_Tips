package sg.edu.rp.c346.id20011262.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lvExamTips;
    String[] ExamtipsArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips);

        ExamtipsArray = new String[5];
        ExamtipsArray[0] = "Don't just read the code, code it as much as possible during eaach practical session";
        ExamtipsArray[1] = "Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        ExamtipsArray[2] = "Prepare your template source code for each topic";
        ExamtipsArray[3] = "Create a few empty Android projects to speed up your coding during the exam";
        ExamtipsArray[4] = "Ensure that your Android Studio is up and running before the exam";

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,ExamtipsArray);
        lvExamTips.setAdapter(adapter);
    }
}