// package _Experiments_;// package _Experiments_;//Created by Ryan on 4/21/17.
// import org.json.JSONArray;
// import org.json.JSONException;
// import org.json.JSONObject;
// public class tdStateToJson
// {
//     static class entry
//     {
//         String label;
//         Object thing;
//         entry(String label,Object thing)
//         {
//             this.label=label;
//             this.thing=thing;
//         }
//     }
//     public static entry c(String l,Object t)
//     {
//         return new entry(l,t);
//     }
//     // public static JSONObject dict(_Experiments_.entry...entries)
//     // {
//     //     JSONObject obj=new JSONObject();
//     //     for(_Experiments_.entry e:entries)
//     //     {
//     //         obj.
//     //     }
//     // }
//     public static void main(String[] args) throws JSONException
//     {
//         JSONArray array=new JSONArray();
//         JSONObject obj=new JSONObject();
//         obj.put("test",array);
//         System.out.println(obj.toString());
//     }
// }
// TdStateToJsonFormatKt.java
// import kotlin.Pair;
// import kotlin.TuplesKt;
// import kotlin.collections.CollectionsKt;
// import kotlin.collections.MapsKt;
// import kotlin.jvm.internal.Intrinsics;
// import org.jetbrains.annotations.NotNull;
// import org.json.JSONObject;
//
// import java.util.Map;
// class TdStateToJson
// {
//     public static void main(@NotNull String[] args)
//     {
//         Intrinsics.checkParameterIsNotNull(args,"args");
// //⁠⁠⁠⁠⁠                        ⎧                                                                                                                                                         ⎫
// //⁠⁠⁠⁠⁠                        ⎪                                          ⎧                                                                                                             ⎫⎪
// //⁠⁠⁠⁠⁠                        ⎪                                          ⎪                     ⎧                                                                                      ⎫⎪⎪
// //⁠⁠⁠⁠⁠                        ⎪                                          ⎪                     ⎪                                         ⎧                                           ⎫⎪⎪⎪
// //⁠⁠⁠⁠⁠                        ⎪           ⎧                 ⎫            ⎪                     ⎪           ⎧                ⎫            ⎪                                ⎧         ⎫⎪⎪⎪⎪
//         Map g=MapsKt.mapOf(TuplesKt.to("Hello","goodbye"),TuplesKt.to("Senior",MapsKt.mapOf(TuplesKt.to("Citizen","kite"),TuplesKt.to("arraytest",CollectionsKt.listOf(1,2,3,4,5)))));
// //⁠⁠⁠⁠⁠                        ⎪           ⎩                 ⎭            ⎪                     ⎪           ⎩                ⎭            ⎪                                ⎩         ⎭⎪⎪⎪⎪
// //⁠⁠⁠⁠⁠                        ⎪                                          ⎪                     ⎪                                         ⎩                                           ⎭⎪⎪⎪
// //⁠⁠⁠⁠⁠                        ⎪                                          ⎪                     ⎩                                                                                      ⎭⎪⎪
// //⁠⁠⁠⁠⁠                        ⎪                                          ⎩                                                                                                             ⎭⎪
// //⁠⁠⁠⁠⁠                        ⎩                                                                                                                                                         ⎭
//         JSONObject h=new JSONObject(g);
//         System.out.println(g);
//         System.out.println(h);
//     }
// }
//
