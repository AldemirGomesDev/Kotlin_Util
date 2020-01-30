
class ChangeListener {

    editTtext.setOnFocusChangeListener { p0, p1 ->
      Log.d("requestFocus", " p1: $p1")
      if (p1) {
          view_cargo_code.setBackgroundColor(resources.getColor(R.color.primary))
      } else {
          view_cargo_code.setBackgroundColor(resources.getColor(R.color.gray))
          
      }
  }

  editTtext.addTextChangedListener(object : TextWatcher {
    override fun afterTextChanged(p0: Editable?) {
        root.barcode_label.text = p0?.length.toString()
    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        if (p1 > 0 || p3 > 2) {
            floatingPhoto.visibility = View.VISIBLE
        } else {
            floatingPhoto.visibility = View.GONE
        }
    }

})

}