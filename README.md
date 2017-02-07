# Android Data Binding compilation warning sample
 
 This project created to reproduce Data Binding compilation unchecked warnings.
 
 Sample reproduces unchecked warnings in 3 different places of generated code (2 warning for one of cases)
  
 More details - https://code.google.com/p/android/issues/detail?id=231524

 
 To reproduce it just run build:
 ```
 ./gradlew assembleDebug
 ```
 
 You will see unchecked warnings in the logs:
 ```
 :app:compileDebugJavaWithJavac
 /project/path/data-binding-warning-sample/app/build/generated/source/apt/debug/ru/gildor/databindingwarnings/databinding/ActivityMainBinding.java:64: warning: [unchecked] unchecked cast
                 setList((java.util.List<java.lang.Integer>) variable);
                                                             ^
   required: List<Integer>
   found:    Object
 /project/path/data-binding-warning-sample/app/build/generated/source/apt/debug/ru/gildor/databindingwarnings/databinding/ActivityMainBinding.java:111: warning: [unchecked] unchecked cast
                 return onChangeModelText((android.databinding.ObservableField<java.lang.String>) object, fieldId);
                                                                                                  ^
   required: ObservableField<String>
   found:    Object
 /project/path/data-binding-warning-sample/app/build/generated/source/apt/debug/ru/gildor/databindingwarnings/databinding/ActivityMainBinding.java:151: warning: [unchecked] unchecked conversion
                     presenterOnListenerCallRuGildorDatabindingwarningsBindingAdaptersListener = (((mPresenterOnListenerCallRuGildorDatabindingwarningsBindingAdaptersListener == null) ? (mPresenterOnListenerCallRuGildorDatabindingwarningsBindingAdaptersListener = new ListenerImpl()) : mPresenterOnListenerCallRuGildorDatabindingwarningsBindingAdaptersListener).setValue(presenter));
                                                                                                                                                                                                                                                                                                                                                                                  ^
   required: Listener<String>
   found:    ListenerImpl
 /project/path/data-binding-warning-sample/app/build/generated/source/apt/debug/ru/gildor/databindingwarnings/databinding/ActivityMainBinding.java:151: warning: [unchecked] unchecked conversion
                     presenterOnListenerCallRuGildorDatabindingwarningsBindingAdaptersListener = (((mPresenterOnListenerCallRuGildorDatabindingwarningsBindingAdaptersListener == null) ? (mPresenterOnListenerCallRuGildorDatabindingwarningsBindingAdaptersListener = new ListenerImpl()) : mPresenterOnListenerCallRuGildorDatabindingwarningsBindingAdaptersListener).setValue(presenter));
                                                                                                 ^
   required: Listener<String>
   found:    ListenerImpl
 4 warnings
 ```
