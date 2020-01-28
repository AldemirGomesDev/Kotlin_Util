
class objectAnimator {

  // Animação aparecer de cima pra baixo
    fun animator(flag: Boolean) {
      val ll_alert = (LinearLayout) findViewById(R.id.ll_alert)
      ll_alert.visibility = View.VISIBLE
      ll_alert.y = 0f

      val animacao2 = PropertyValuesHolder.ofFloat("y", 0f, 150f)
      val anim = ObjectAnimator.ofPropertyValuesHolder(root.ll_alert, animacao2)
      anim.duration = 500
      if (flag) {
          anim.start()
      } else {
          anim.reverse()
      }
    }
}
   fun animator2(flag:Boolean) {
      root.ll_alert.visibility = View.VISIBLE
      val anim = ObjectAnimator.ofFloat(root.ll_alert, "alpha", 0f, 1f)
      anim.duration = 500
      if (flag) {
          anim.start()
      } else {
          anim.reverse()
      }
  }

}