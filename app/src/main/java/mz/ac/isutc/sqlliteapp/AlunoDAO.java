package mz.ac.isutc.sqlliteapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class AlunoDAO {
    private DBHandler com;
    private SQLiteDatabase db;

    public AlunoDAO(Context context){
        com = new DBHandler(context);
        db = com.getWritableDatabase();
    }
    public long inserir(Aluno a){

        ContentValues contentValues = new  ContentValues();

        contentValues.put("NOME", a.getNome());
        contentValues.put("CURSO", a.getCurso());

        return db.insert("ALUNOS",null, contentValues);

    }
}
