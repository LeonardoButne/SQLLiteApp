package mz.ac.isutc.sqlliteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import mz.ac.isutc.sqlliteapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //DBHandler handler = new DBHandler(MainActivity.this);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Aluno aluno = new Aluno(binding.edtNome.getText().toString(), binding.edtCurso.getText().toString());
                AlunoDAO alunoDAO = new AlunoDAO(MainActivity.this);
                long id = alunoDAO.inserir(aluno);

                Toast.makeText(MainActivity.this, "Salvo com sucesso. ID: " + id, Toast.LENGTH_SHORT).show();
               // handler.gravar(binding.edtNome.getText().toString(), binding.edtCurso.getText().toString());
            }
        });

    }
}