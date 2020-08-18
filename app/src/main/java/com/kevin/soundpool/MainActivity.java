package com.kevin.soundpool;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SoundPool soundPool;
    private int sound1, sound2, sound3, sound4, sound5, sound6, sound7, sound8, sound9, sound10, sound11, sound12, sound13, sound14, sound15, sound16, sound17
            ,sound18, sound19, sound20, sound21, sound22, sound23, sound24, sound25, sound26, sound27, sound28, sound29, sound30, sound31, sound32, sound33
            ,sound34,sound35,sound36,sound37,sound38,sound39,sound40,sound41,sound42,sound43,sound44,sound45,sound46,sound47,sound48,sound49,sound50,sound51
            ,sound52,sound53,sound54,sound55,sound56,sound57,sound58, sound59, sound60, sound61, sound62, sound63, sound64, sound65, sound66, sound67, sound68
            ,sound69, sound70, sound71,sound72, sound73, sound74, sound75, sound76, sound77, sound78, sound79, sound80, sound81, sound82, sound83, sound84, sound85, sound86
            ,sound87, sound88, sound89, sound90, sound91, sound92, sound93, sound94, sound95, sound96, sound97, sound98, sound99, sound100, sound101, sound102, sound103, sound104
            ,sound105, sound106, sound107, sound108,sound109, sound110, sound111,sound112,sound113, sound114,sound115,sound116,sound117,sound118,sound119,sound120, sound121, sound122
            ,sound123, sound124, sound125, sound126, sound127, sound128, sound129,sound130, sound131, sound132;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            soundPool = new SoundPool.Builder()
                    .setMaxStreams(1)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        }
        sound1  = soundPool.load(this, R.raw.sound1, 1);
        sound2  = soundPool.load(this, R.raw.sound2, 1);
        sound3  = soundPool.load(this, R.raw.sound3, 1);
        sound4  = soundPool.load(this, R.raw.sound4, 1);
        sound5  = soundPool.load(this, R.raw.sound5, 1);
        sound6  = soundPool.load(this, R.raw.sound6, 1);
        sound7  = soundPool.load(this, R.raw.sound7, 1);
        sound8  = soundPool.load(this, R.raw.sound8, 1);
        sound9  = soundPool.load(this, R.raw.sound9, 1);
        sound10 = soundPool.load(this, R.raw.sound10, 1);
        sound11 = soundPool.load(this, R.raw.sound11, 1);
        sound12 = soundPool.load(this, R.raw.sound12, 1);
        sound13 = soundPool.load(this, R.raw.sound13, 1);
        sound14 = soundPool.load(this, R.raw.sound14, 1);
        sound15 = soundPool.load(this, R.raw.sound15, 1);
        sound16 = soundPool.load(this, R.raw.sound16, 1);
        sound17 = soundPool.load(this, R.raw.sound17, 1);
        sound18 = soundPool.load(this, R.raw.sound18, 1);
        sound19 = soundPool.load(this, R.raw.sound19, 1);
        sound20 = soundPool.load(this, R.raw.sound20, 1);
        sound21 = soundPool.load(this, R.raw.sound21, 1);
        sound22 = soundPool.load(this, R.raw.sound22, 1);
        sound23 = soundPool.load(this, R.raw.sound23, 1);
        sound24 = soundPool.load(this, R.raw.sound24, 1);
        sound25 = soundPool.load(this, R.raw.sound25, 1);
        sound26 = soundPool.load(this, R.raw.sound26, 1);
        sound27 = soundPool.load(this, R.raw.sound27, 1);
        sound28 = soundPool.load(this, R.raw.sound28, 1);
        sound29 = soundPool.load(this, R.raw.sound29, 1);
        sound30 = soundPool.load(this, R.raw.sound30, 1);
        sound31 = soundPool.load(this, R.raw.sound31, 1);
        sound32 = soundPool.load(this, R.raw.sound32, 1);
        sound33 = soundPool.load(this, R.raw.sound33, 1);
        sound34 = soundPool.load(this, R.raw.sound34, 1);
        sound35 = soundPool.load(this, R.raw.sound35, 1);
        sound36 = soundPool.load(this, R.raw.sound36, 1);
        sound37 = soundPool.load(this, R.raw.sound37, 1);
        sound38 = soundPool.load(this, R.raw.sound38, 1);
        sound39 = soundPool.load(this, R.raw.sound39, 1);
        sound40 = soundPool.load(this, R.raw.sound40, 1);
        sound41 = soundPool.load(this, R.raw.sound41, 1);
        sound42 = soundPool.load(this, R.raw.sound42, 1);
        sound43 = soundPool.load(this, R.raw.sound43, 1);
        sound44 = soundPool.load(this, R.raw.sound44, 1);
        sound45 = soundPool.load(this, R.raw.sound45, 1);
        sound46 = soundPool.load(this, R.raw.sound46, 1);
        sound47 = soundPool.load(this, R.raw.sound47, 1);
        sound48 = soundPool.load(this, R.raw.sound48, 1);
        sound49 = soundPool.load(this, R.raw.sound49, 1);
        sound50 = soundPool.load(this, R.raw.sound50, 1);
        sound51 = soundPool.load(this, R.raw.sound51, 1);
        sound52 = soundPool.load(this, R.raw.sound52, 1);
        sound53 = soundPool.load(this, R.raw.sound53, 1);
        sound54 = soundPool.load(this, R.raw.sound54, 1);
        sound55 = soundPool.load(this, R.raw.sound55, 1);
        sound56 = soundPool.load(this, R.raw.sound56, 1);
        sound57 = soundPool.load(this, R.raw.sound57, 1);
        sound58 = soundPool.load(this, R.raw.sound58, 1);
        sound59 = soundPool.load(this, R.raw.sound59, 1);
        sound60 = soundPool.load(this, R.raw.sound60, 1);
        sound61 = soundPool.load(this, R.raw.sound61, 1);
        sound62 = soundPool.load(this, R.raw.sound62, 1);
        sound63 = soundPool.load(this, R.raw.sound63, 1);
        sound64 = soundPool.load(this, R.raw.sound64, 1);
        sound65 = soundPool.load(this, R.raw.sound65, 1);
        sound66 = soundPool.load(this, R.raw.sound66, 1);
        sound67 = soundPool.load(this, R.raw.sound67, 1);
        sound68 = soundPool.load(this, R.raw.sound68, 1);
        sound69 = soundPool.load(this, R.raw.sound69, 1);
        sound70 = soundPool.load(this, R.raw.sound70, 1);
        sound71 = soundPool.load(this, R.raw.sound71, 1);
        sound72 = soundPool.load(this, R.raw.sound72, 1);
        sound73 = soundPool.load(this, R.raw.sound73, 1);
        sound74 = soundPool.load(this, R.raw.sound74, 1);
        sound75 = soundPool.load(this, R.raw.sound75, 1);
        sound76 = soundPool.load(this, R.raw.sound76, 1);
        sound77 = soundPool.load(this, R.raw.sound77, 1);
        sound78 = soundPool.load(this, R.raw.sound78, 1);
        sound79 = soundPool.load(this, R.raw.sound79, 1);
        sound80 = soundPool.load(this, R.raw.sound80, 1);
        sound81 = soundPool.load(this, R.raw.sound81, 1);
        sound82 = soundPool.load(this, R.raw.sound82, 1);
        sound83 = soundPool.load(this, R.raw.sound83, 1);
        sound84 = soundPool.load(this, R.raw.sound84, 1);
        sound85 = soundPool.load(this, R.raw.sound85, 1);
        sound86 = soundPool.load(this, R.raw.sound86, 1);
        sound87 = soundPool.load(this, R.raw.sound87, 1);
        sound88 = soundPool.load(this, R.raw.sound88, 1);
        sound89 = soundPool.load(this, R.raw.sound89, 1);
        sound90 = soundPool.load(this, R.raw.sound90, 1);
        sound91 = soundPool.load(this, R.raw.sound91, 1);
        sound92 = soundPool.load(this, R.raw.sound92, 1);
        sound93 = soundPool.load(this, R.raw.sound93, 1);
        sound94 = soundPool.load(this, R.raw.sound94, 1);
        sound95 = soundPool.load(this, R.raw.sound95, 1);
        sound96 = soundPool.load(this, R.raw.sound96, 1);
        sound97 = soundPool.load(this, R.raw.sound97, 1);
        sound98 = soundPool.load(this, R.raw.sound98, 1);
        sound99 = soundPool.load(this, R.raw.sound99, 1);
        sound100 = soundPool.load(this, R.raw.sound100, 1);
        sound101 = soundPool.load(this, R.raw.sound101, 1);
        sound102 = soundPool.load(this, R.raw.sound102, 1);
        sound103 = soundPool.load(this, R.raw.sound103, 1);
        sound104 = soundPool.load(this, R.raw.sound104, 1);
        sound105 = soundPool.load(this, R.raw.sound105, 1);
        sound106 = soundPool.load(this, R.raw.sound106, 1);
        sound107 = soundPool.load(this, R.raw.sound107, 1);
        sound108 = soundPool.load(this, R.raw.sound108, 1);
        sound109 = soundPool.load(this, R.raw.sound109, 1);
        sound110 = soundPool.load(this, R.raw.sound110, 1);
        sound111 = soundPool.load(this, R.raw.sound111, 1);
        sound112 = soundPool.load(this, R.raw.sound112, 1);
        sound113 = soundPool.load(this, R.raw.sound113, 1);
        sound114 = soundPool.load(this, R.raw.sound114, 1);
        sound115 = soundPool.load(this, R.raw.sound115, 1);
        sound116 = soundPool.load(this, R.raw.sound116, 1);
        sound117 = soundPool.load(this, R.raw.sound117, 1);
        sound118 = soundPool.load(this, R.raw.sound118, 1);
        sound119 = soundPool.load(this, R.raw.sound119, 1);
        sound120 = soundPool.load(this, R.raw.sound120, 1);
        sound121 = soundPool.load(this, R.raw.sound121, 1);
        sound122 = soundPool.load(this, R.raw.sound122, 1);
        sound123 = soundPool.load(this, R.raw.sound123, 1);
        sound124 = soundPool.load(this, R.raw.sound124, 1);
        sound125 = soundPool.load(this, R.raw.sound125, 1);
        sound126 = soundPool.load(this, R.raw.sound126, 1);
        sound127 = soundPool.load(this, R.raw.sound127, 1);
        sound128 = soundPool.load(this, R.raw.sound128, 1);
        sound129 = soundPool.load(this, R.raw.sound129, 1);
        sound130 = soundPool.load(this, R.raw.sound130, 1);
        sound131 = soundPool.load(this, R.raw.sound131, 1);
        sound132 = soundPool.load(this, R.raw.sound132, 1);

    }
    public void playSound(View v) {
        switch (v.getId()) {
            case R.id.button_sound1:
                soundPool.play(sound1, 1, 1, 0, 0, 1);
                //soundPool.pause(sound3StreamId);
                break;
            case R.id.button_sound2:
                soundPool.play(sound2, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound3:
                soundPool.play(sound3, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound4:
                soundPool.play(sound4, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound5:
                soundPool.play(sound5, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound6:
                soundPool.play(sound6, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound7:
                soundPool.play(sound7, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound8:
                soundPool.play(sound8, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound9:
                soundPool.play(sound9, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound10:
                soundPool.play(sound10, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound11:
                soundPool.play(sound11, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound12:
                soundPool.play(sound12, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound13:
                soundPool.play(sound13, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound14:
                soundPool.play(sound14, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound15:
                soundPool.play(sound15, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound16:
                soundPool.play(sound16, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound17:
                soundPool.play(sound17, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound18:
                soundPool.play(sound18, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound19:
                soundPool.play(sound19, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound20:
                soundPool.play(sound20, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound21:
                soundPool.play(sound21, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound22:
                soundPool.play(sound22, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound23:
                soundPool.play(sound23, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound24:
                soundPool.play(sound24, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound25:
                soundPool.play(sound25, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound26:
                soundPool.play(sound26, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound27:
                soundPool.play(sound27, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound28:
                soundPool.play(sound28, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound29:
                soundPool.play(sound29, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound30:
                soundPool.play(sound30, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound31:
                soundPool.play(sound31, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound32:
                soundPool.play(sound32, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound33:
                soundPool.play(sound33, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound34:
                soundPool.play(sound34, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound35:
                soundPool.play(sound35, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound36:
                soundPool.play(sound36, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound37:
                soundPool.play(sound37, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound38:
                soundPool.play(sound38, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound39:
                soundPool.play(sound39, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound40:
                soundPool.play(sound40, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound41:
                soundPool.play(sound41, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound42:
                soundPool.play(sound42, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound43:
                soundPool.play(sound43, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound44:
                soundPool.play(sound44, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound45:
                soundPool.play(sound45, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound46:
                soundPool.play(sound46, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound47:
                soundPool.play(sound47, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound48:
                soundPool.play(sound48, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound49:
                soundPool.play(sound49, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound50:
                soundPool.play(sound50, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound51:
                soundPool.play(sound51, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound52:
                soundPool.play(sound52, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound53:
                soundPool.play(sound53, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound54:
                soundPool.play(sound54, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound55:
                soundPool.play(sound55, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound56:
                soundPool.play(sound56, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound57:
                soundPool.play(sound57, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound58:
                soundPool.play(sound58, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound59:
                soundPool.play(sound59, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound60:
                soundPool.play(sound60, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound61:
                soundPool.play(sound61, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound62:
                soundPool.play(sound62, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound63:
                soundPool.play(sound63, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound64:
                soundPool.play(sound64, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound65:
                soundPool.play(sound65, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound66:
                soundPool.play(sound66, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound67:
                soundPool.play(sound67, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound68:
                soundPool.play(sound68, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound69:
                soundPool.play(sound69, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound70:
                soundPool.play(sound70, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound71:
                soundPool.play(sound71, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound72:
                soundPool.play(sound72, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound73:
                soundPool.play(sound73, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound74:
                soundPool.play(sound74, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound75:
                soundPool.play(sound75, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound76:
                soundPool.play(sound76, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound77:
                soundPool.play(sound77, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound78:
                soundPool.play(sound78, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound79:
                soundPool.play(sound79, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound80:
                soundPool.play(sound80, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound81:
                soundPool.play(sound81, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound82:
                soundPool.play(sound82, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound83:
                soundPool.play(sound83, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound84:
                soundPool.play(sound84, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound85:
                soundPool.play(sound85, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound86:
                soundPool.play(sound86, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound87:
                soundPool.play(sound87, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound88:
                soundPool.play(sound88, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound89:
                soundPool.play(sound89, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound90:
                soundPool.play(sound90, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound91:
                soundPool.play(sound91, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound92:
                soundPool.play(sound92, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound93:
                soundPool.play(sound93, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound94:
                soundPool.play(sound94, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound95:
                soundPool.play(sound95, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound96:
                soundPool.play(sound96, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound97:
                soundPool.play(sound97, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound98:
                soundPool.play(sound98, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound99:
                soundPool.play(sound99, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound100:
                soundPool.play(sound100, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound101:
                soundPool.play(sound101, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound102:
                soundPool.play(sound102, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound103:
                soundPool.play(sound103, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound104:
                soundPool.play(sound104, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound105:
                soundPool.play(sound105, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound106:
                soundPool.play(sound106, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound107:
                soundPool.play(sound107, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound108:
                soundPool.play(sound108, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound109:
                soundPool.play(sound109, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound110:
                soundPool.play(sound110, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound111:
                soundPool.play(sound111, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound112:
                soundPool.play(sound112, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound113:
                soundPool.play(sound113, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound114:
                soundPool.play(sound114, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound115:
                soundPool.play(sound115, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound116:
                soundPool.play(sound116, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound117:
                soundPool.play(sound117, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound118:
                soundPool.play(sound118, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound119:
                soundPool.play(sound119, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound120:
                soundPool.play(sound120, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound121:
                soundPool.play(sound121, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound122:
                soundPool.play(sound122, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound123:
                soundPool.play(sound123, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound124:
                soundPool.play(sound124, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound125:
                soundPool.play(sound125, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound126:
                soundPool.play(sound126, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound127:
                soundPool.play(sound127, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound128:
                soundPool.play(sound128, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound129:
                soundPool.play(sound129, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound130:
                soundPool.play(sound130, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound131:
                soundPool.play(sound131, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound132:
                soundPool.play(sound131, 1, 1, 0, 0, 1);
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }

}