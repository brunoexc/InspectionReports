package ab.caride;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_admin);
    }


    public void OnClickbuttonMenuReports (View view){

        Intent call_activity_menu_reports = new Intent(this, MenuReportsActivity.class);
        startActivity(call_activity_menu_reports);

    }


}
