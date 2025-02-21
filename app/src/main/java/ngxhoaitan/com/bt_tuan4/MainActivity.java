package ngxhoaitan.com.bt_tuan4;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout mainLayout;
    private Switch switchTheme;
    private int[] backgrounds = {R.drawable.backgroud_1, R.drawable.backgroud_2, R.drawable.backgroud_3}; // Danh sách hình nền
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ layout và switch
        mainLayout = findViewById(R.id.mainLayout);
        switchTheme = findViewById(R.id.switchTheme);

        // Chọn hình nền ngẫu nhiên khi mở app
        int randomIndex = random.nextInt(backgrounds.length);
        mainLayout.setBackgroundResource(backgrounds[randomIndex]);

        // Bắt sự kiện khi bấm switch
        switchTheme.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Khi nhấn switch -> đổi hình nền ngẫu nhiên
                int newRandomIndex = random.nextInt(backgrounds.length);
                mainLayout.setBackgroundResource(backgrounds[newRandomIndex]);
            }
        });
    }
}