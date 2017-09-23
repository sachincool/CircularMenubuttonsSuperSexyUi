package luthra.harshit.circularmenubuttonssupersexyui;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {

    String array[]={"Facebook","Twitter","YouTube","Camera"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CircleMenu circleMenu=(CircleMenu)findViewById(R.id.circle_menu_hitomis);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.ic_action_name,R.drawable.ic_action_remove)
                .addSubMenu(Color.parseColor("#258cff"),R.drawable.ic_action_like)
                .addSubMenu(Color.parseColor("#6d4c41"),R.drawable.ic_action_face)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.ic_action_search)
                .addSubMenu(Color.parseColor("#03a9f4"),R.drawable.ic_action_pic)
                 .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                     @Override
                     public void onMenuSelected(int i) {
                         Toast.makeText(MainActivity.this,"Selected option is "+array[i],Toast.LENGTH_LONG).show();
                     }
                 })   ;

    }
}
