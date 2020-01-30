class CargoTypeSelectFragment : Fragment() {

  lateinit var root: View

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?

): View? {
        root = inflater.inflate(R.layout.fragment_cargo_type_select, container, false)

        val yourEt = root.findViewById(R.id.TextInputSpinner) as TextInputEditText

        yourEt.setOnClickListener { view -> showCustomSpinnerDialog(view) }

        return root
}


  private fun showCustomSpinnerDialog(v: View) {
    val titleId: Int = R.string.carga_select
    val listId: Int = R.array.select_carga_arr
    val editTextId: Int = R.id.TextInputSpinner
    val spinnerFragment = SpinnerFragment.newInstance(titleId, listId, editTextId)
    spinnerFragment!!.show(fragmentManager!!, "customSpinner")
    root.cargo_code_txt?.requestFocus()
    showKeyboard()

}
}