package FragmentChonMon;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

import com.example.passio_caffee.R;

import java.util.ArrayList;

import Adapter.ChonMon;
import Adapter.ChonMonAdapter;
import TruyVan.GreenXmasTV;

public class FragmentGreenXmas extends Fragment {

    GridView gv304;
    ArrayList<ChonMon> arrayList304;
    ChonMonAdapter adapter304;
    GreenXmasTV greenXmasTV304;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v304 = inflater.inflate(R.layout.fragment__green_xmas, container, false);

        greenXmasTV304 = new GreenXmasTV(getActivity());
        arrayList304 = greenXmasTV304.getAll();
        gv304 = (GridView) v304.findViewById(R.id.grid_view);
        adapter304 = new ChonMonAdapter(getActivity(), arrayList304);
        gv304.setAdapter(adapter304);
        return v304;
    }
}
