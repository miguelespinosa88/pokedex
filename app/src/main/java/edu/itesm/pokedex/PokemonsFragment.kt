package edu.itesm.pokedex

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_pokemons.*

/**
 * A simple [Fragment] subclass.
 * Use the [PokemonsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PokemonsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pokemons, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }
    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        pokemons_recycler.apply{
            layoutManager=LinearLayoutManager(activity)
            adapter=PokemonsAdapter(createData())
        }
    }

    fun createData(): ArrayList<Pokemon>{
        val pokemons = ArrayList<Pokemon>()
        pokemons.add(Pokemon(R.drawable.groudoon,"GROUDON", "Tierra","A Groudon siempre se le ha descrito como el Pokémon que expandió los continentes. Varias leyendas cuentan que libró combates contra Kyogre en repetidas ocasiones para tener el control de la energía de la naturaleza."))
        pokemons.add(Pokemon(R.drawable.kyogree, "KYOGRE", "Agua", "Kyogre se sirve de la energía de la naturaleza para realizar su Regresión Primigenia y recobrar su apariencia primitiva. Con tal poder, puede desencadenar tempestades para expandir los océanos."))
        pokemons.add(Pokemon(R.drawable.rayquazaa, "RAYQUAZA", "Dragon", "Dicen que Rayquaza ha vivido durante millones de años. Las leyendas cuentan que puso fin al continuo enfrentamiento entre Groudon y Kyogre. "))
        pokemons.add(Pokemon(R.drawable.deoxyys, "DEOXYS", "Psiquico", "Tras estar expuesto a un rayo láser, el ADN de un virus espacial sufrió una mutación y dio origen a Deoxys. Según parece, el órgano cristalino que este Pokémon tiene en el torso es el cerebro."))
        pokemons.add(Pokemon(R.drawable.latiaas, "LATIAS", "Dragon", "Latias es muy sensible a los sentimientos de la gente. Si detecta algún ápice de hostilidad, desplegará las plumas que tiene por todo el cuerpo y se pondrá a chillar para intimidar al enemigo."))
        pokemons.add(Pokemon(R.drawable.latioos, "LATIOS", "Dragon", "Latios tiene la habilidad de hacer que los demás vean algo que él ha visto o imaginado. Este Pokémon es muy inteligente. Es capaz de entender el lenguaje humano."))
        pokemons.add(Pokemon(R.drawable.lugiaa, "LUGIA", "Psiquico", "La fuerza que tiene Lugia en las alas es devastadora; con nada que las bata es capaz de derribar edificios enteros. Por eso mismo, prefiere vivir donde no haya nadie, en lo más profundo del mar."))
        pokemons.add(Pokemon(R.drawable.hoooh, "HO-OH", "Fuego", "El plumaje de Ho-Oh contiene siete colores que pueden apreciarse según el ángulo desde el que les dé la luz. Dicen que sus plumas dan felicidad a quienes las llevan y, también, que este Pokémon vive a los pies del arco iris."))
        pokemons.add(Pokemon(R.drawable.celebii, "CELEBI", "Psiquico", "Este Pokémon vino del futuro haciendo un viaje en el tiempo. Hay quien piensa que, mientras Celebi siga apareciendo, hay un futuro brillante y esperanzador."))
        pokemons.add(Pokemon(R.drawable.darkraii, "DARKRAI", "Hada", "Defiende su territorio de personas y Pokémon haciéndoles dormir y provocándoles pesadillas."))
        pokemons.add(Pokemon(R.drawable.dialgaa, "DIALGA", "Acero", "Un Pokémon de leyenda. Se dice que el tiempo comenzó a avanzar cuando Dialga nació."))
        pokemons.add(Pokemon(R.drawable.palkiaa, "PALKIA", "Agua", "Se dice que vive en una dimensión espacial paralela. Aparece en la mitología."))
        pokemons.add(Pokemon(R.drawable.giratinaa,"GITATINA","Fantasma","Vive en el Mundo Distorsión, un mundo opuesto al nuestro y cuyas leyes desafían el sentido común."))
        pokemons.add(Pokemon(R.drawable.meew,"MEW","Psiquico","Si se observa a través de un microscopio, puede distinguirse cuán corto, fino y delicado es el pelaje de este Pokémon."))
        pokemons.add(Pokemon(R.drawable.mewtwoo,"MEWTWO","Psiquico","Su ADN es casi el mismo que el de Mew. Sin embargo, su tamaño y carácter son muy diferentes."))
        return pokemons
    }



}