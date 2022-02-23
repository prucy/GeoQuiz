package com.crystal.android.geoquiz

import androidx.annotation.StringRes

// @StringRes : 어노테이션
// 사용 이유 : 생성자에서 유효한 문자열 리소스 ID를 제공하는지를 컴파일 시점에서 Lint(안드로이드 스튜디오 코드 검사기)가 검사해서,
// 유효하지 않은 리소스 ID가 생성자에 사용되어 런타임 시에 앱이 중단되는 것을 방지
data class Question(@StringRes val textResId: Int, val answer: Boolean, var cheat: Boolean)