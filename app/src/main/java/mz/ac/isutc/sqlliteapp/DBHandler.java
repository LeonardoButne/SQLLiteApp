package mz.ac.isutc.sqlliteapp;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHandler extends SQLiteOpenHelper {



    private static final String BD_name = "testeDB.DB"; //nome da base de dados

    //private static final String TABLE_NAME = "ALUNOS";

    //colunas
    private static final String ID = " id ";
    private static final String NOME = " nome_do_aluno ";
    private static final String CURSO = " curso ";

    //versao
    private static final int DB_VERSION = 1;

   // private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME+" "+ "(" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + NOME + " TEXT NOT NULL, " + CURSO + " TEXT NOT NULL );";

    public DBHandler(@Nullable Context context) {
        super(context, BD_name, null, DB_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE ALUNOS (ID INTEGER PRIMARY KEY AUTOINCREMENT, NOME VARCHAR(50), CURSO VARCHAR(50))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
//
//        onCreate(db);
    }

//    public void gravar(String nome, String curso){
//        SQLiteDatabase db = this.getWritableDatabase();
//
//        ContentValues valores = new ContentValues();
//
//        valores.put("NOME", nome);
//        valores.put("CURSO", curso);
//
//        db.insert(TABLE_NAME, null,valores);
//
//        db.close();
//    }
}
