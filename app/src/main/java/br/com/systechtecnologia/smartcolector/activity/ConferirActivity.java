package br.com.systechtecnologia.smartcolector.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

import br.com.systechtecnologia.smartcolector.R;
import br.com.systechtecnologia.smartcolector.adapter.AdapterConferencia;

public class ConferirActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MaterialSearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conferir);
        Toolbar toolbar = findViewById(R.id.toolbarConferencia);
        toolbar.setTitle("Conferência");
        setSupportActionBar(toolbar);
        //inicialização de componentes
        searchView = findViewById(R.id.searchViewConferencia);
        recyclerView = findViewById(R.id.recyclerCoferencia);
        //Configurar Adapter
        AdapterConferencia adapterConferencia = new AdapterConferencia();
        //Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterConferencia);
        //Configura métodos para o SearchView
        searchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {

            }

            @Override
            public void onSearchViewClosed() {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_conferencia, menu);
        MenuItem item = menu.findItem(R.id.menu_search_conferencia);
        searchView.setMenuItem(item);
        return true;
    }
}
