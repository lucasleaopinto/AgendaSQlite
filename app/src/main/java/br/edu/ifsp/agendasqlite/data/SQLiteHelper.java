package br.edu.ifsp.agendasqlite.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

class SQLiteHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "agenda.db";
    static final String TABLE_NAME = "contatos";

    static final String KEY_ID = "id";
    static final String KEY_NOME = "nome";
    static final String KEY_FONE = "fone";
    static final String KEY_EMAIL = "email";
    static final String KEY_FAVORITO = "favorito";
    static final String KEY_FONE_ADICIONAL = "fone_adicional";
    static final String KEY_DT_NASCIMENTO = "dt_nascimento";


    private static final int DATABASE_VERSION = 1;

    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ("
            + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + KEY_NOME + " TEXT, "
            + KEY_FONE + " TEXT, "
            + KEY_EMAIL + " TEXT, "
            + KEY_FAVORITO + " TEXT, "
            + KEY_FONE_ADICIONAL + " TEXT, "
            + KEY_DT_NASCIMENTO + " TEXT);";

    private static final String UPDATE_VERSION_2 = "ALTER TABLE " + TABLE_NAME + " ADD COLUMN " + KEY_FAVORITO + " integer ";
    private static final String UPDATE_VERSION_3 = "ALTER TABLE " + TABLE_NAME + " ADD COLUMN " + KEY_FONE_ADICIONAL + " TEXT ";
    private static final String UPDATE_VERSION_4 = "ALTER TABLE " + TABLE_NAME + " ADD COLUMN " + KEY_DT_NASCIMENTO + " TEXT ";


    public SQLiteHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        //está migrando da versão 1 para 2
        if (oldVersion < 2){
            db.execSQL(UPDATE_VERSION_2);
        }
        //está migrando da versão 2 para 3
        if (oldVersion < 3){
            db.execSQL(UPDATE_VERSION_3);
        }
        if (oldVersion < 4){
            db.execSQL(UPDATE_VERSION_4);
        }
    }
}
