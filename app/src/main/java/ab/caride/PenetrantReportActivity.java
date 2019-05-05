package ab.caride;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class PenetrantReportActivity extends AppCompatActivity {

    Spinner spinner_PenetrantType, spinner_DeveloperType, spinner_SurfaceCondition, spinner_Preparation,
            spinner_TestArea, spinner_ClientTemp, spinner_Discontinuities, spinner_PostCleaning,spinner_TestResults;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penetrant_report);

        spinner_PenetrantType = (Spinner) findViewById(R.id.spn_PenetrantType);
        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, R.array.spinner_PenetrantType_str, android.R.layout.simple_spinner_item);
        spinner_PenetrantType.setAdapter(adapter1);

        spinner_DeveloperType = (Spinner) findViewById(R.id.spn_DeveloperType);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.spinner_DeveloperType_str, android.R.layout.simple_spinner_item);
        spinner_DeveloperType.setAdapter(adapter2);

        spinner_SurfaceCondition = (Spinner) findViewById(R.id.spn_SurfaceCondition);
        ArrayAdapter adapter3 = ArrayAdapter.createFromResource(this, R.array.spinner_SurfaceCondition_str, android.R.layout.simple_spinner_item);
        spinner_SurfaceCondition.setAdapter(adapter3);

        spinner_Preparation = (Spinner) findViewById(R.id.spn_Preparation);
        ArrayAdapter adapter4 = ArrayAdapter.createFromResource(this, R.array.spinner_Preparation_str, android.R.layout.simple_spinner_item);
        spinner_Preparation.setAdapter(adapter4);

        spinner_TestArea = (Spinner) findViewById(R.id.spn_TestArea);
        ArrayAdapter adapter5 = ArrayAdapter.createFromResource(this, R.array.spinner_TestArea_str, android.R.layout.simple_spinner_item);
        spinner_TestArea.setAdapter(adapter5);

        spinner_ClientTemp = (Spinner) findViewById(R.id.spn_ClientName);
        ArrayAdapter adapter6 = ArrayAdapter.createFromResource(this, R.array.spinner_ClientTemp_str, android.R.layout.simple_spinner_item);
        spinner_ClientTemp.setAdapter(adapter6);

        spinner_Discontinuities = (Spinner) findViewById(R.id.spn_Discontinuities);
        ArrayAdapter adapter7 = ArrayAdapter.createFromResource(this, R.array.spinner_Discontinuities_str, android.R.layout.simple_spinner_item);
        spinner_Discontinuities.setAdapter(adapter7);

        spinner_PostCleaning = (Spinner) findViewById(R.id.spn_PostCleaning);
        ArrayAdapter adapter8 = ArrayAdapter.createFromResource(this, R.array.spinner_PostCleaning_str, android.R.layout.simple_spinner_item);
        spinner_PostCleaning.setAdapter(adapter8);

        spinner_TestResults = (Spinner) findViewById(R.id.spn_TestResults);
        ArrayAdapter adapter9 = ArrayAdapter.createFromResource(this, R.array.spinner_TestResults_str, android.R.layout.simple_spinner_item);
        spinner_TestResults.setAdapter(adapter9);

    }

}
