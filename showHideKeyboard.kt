
class ShowHideKeyboard {

  private fun showKeyboard() {
    val mImm = activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
     mImm.toggleSoftInput(
         InputMethodManager.SHOW_FORCED,
         InputMethodManager.RESULT_UNCHANGED_SHOWN
     )
 }

 private fun hideKeyboard() {
     try {
         val mImm = activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
         mImm.hideSoftInputFromWindow(view?.windowToken, 0)
         mImm.hideSoftInputFromWindow(activity?.currentFocus?.windowToken, 0)
     } catch (e: Exception) {
         Log.e("testeteclado", "setUserVisibleHint: ", e)
     }

 }

}