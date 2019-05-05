package ab.caride;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuReportsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_reports);
    }



    public void OnClickbuttonPTReport (View view){

        Intent call_activity_pt_report = new Intent(this, PenetrantReportActivity.class);
        startActivity(call_activity_pt_report);

    }
}
