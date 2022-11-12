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
import TruyVan.FreshEasyTV;
import TruyVan.IceBlendedTV;

public class FragmentFreshEasy extends Fragment {

    GridView gv304;
    ArrayList<ChonMon> arrayList304;
    ChonMonAdapter adapter304;
    FreshEasyTV freshEasyTV304;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view304 = inflater.inflate(R.layout.fragment_fresh_easy, container, false);

        freshEasyTV304 = new FreshEasyTV(getActivity());
        arrayList304 = freshEasyTV304.getAll();
        gv304 = (GridView) view304.findViewById(R.id.grid_view);
        adapter304 = new ChonMonAdapter(getActivity(), arrayList304);
        gv304.setAdapter(adapter304);
        return view304;
    }
}
