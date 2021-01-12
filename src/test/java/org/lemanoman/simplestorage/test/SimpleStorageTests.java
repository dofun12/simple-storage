package org.lemanoman.simplestorage.test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lemanoman.simplestorage.SimpleStorage;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleStorageTests {

    @Test
    void testBigValues(){
        SimpleStorage simpleStorage = new SimpleStorage();
        String giantText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Sem nulla pharetra diam sit amet nisl suscipit adipiscing. Nibh tortor id aliquet lectus proin. Donec ultrices tincidunt arcu non sodales neque sodales. Enim nec dui nunc mattis enim ut tellus elementum. Nec dui nunc mattis enim ut tellus elementum sagittis vitae. Dui ut ornare lectus sit amet est placerat. Suscipit adipiscing bibendum est ultricies integer quis auctor elit sed. Adipiscing elit duis tristique sollicitudin nibh sit amet commodo. Non enim praesent elementum facilisis leo vel fringilla. Turpis egestas integer eget aliquet. Faucibus a pellentesque sit amet porttitor eget. Molestie nunc non blandit massa enim nec. Tortor dignissim convallis aenean et tortor. Lorem donec massa sapien faucibus et. Vestibulum sed arcu non odio euismod lacinia at. Eget arcu dictum varius duis at consectetur. Vulputate eu scelerisque felis imperdiet. Quis varius quam quisque id diam vel. Ac turpis egestas sed tempus urna.\n" +
                "\n" +
                "Sit amet consectetur adipiscing elit pellentesque. Proin sagittis nisl rhoncus mattis. Porttitor rhoncus dolor purus non enim praesent elementum. In fermentum posuere urna nec. Placerat duis ultricies lacus sed turpis tincidunt id. Morbi quis commodo odio aenean sed adipiscing diam donec. Eros in cursus turpis massa tincidunt dui ut ornare lectus. Nibh praesent tristique magna sit amet purus gravida quis blandit. Volutpat est velit egestas dui id. Justo laoreet sit amet cursus sit amet dictum sit.\n" +
                "\n" +
                "Quis imperdiet massa tincidunt nunc pulvinar sapien et ligula ullamcorper. Ipsum nunc aliquet bibendum enim facilisis gravida neque convallis a. Ac tincidunt vitae semper quis lectus nulla at volutpat. Elementum integer enim neque volutpat ac tincidunt vitae semper. Urna condimentum mattis pellentesque id nibh tortor id aliquet lectus. Leo duis ut diam quam nulla porttitor massa id. Et malesuada fames ac turpis egestas. Nulla pharetra diam sit amet nisl suscipit adipiscing. Sed viverra tellus in hac habitasse. Quis enim lobortis scelerisque fermentum dui faucibus in. Mattis vulputate enim nulla aliquet porttitor lacus.\n" +
                "\n" +
                "Nullam vehicula ipsum a arcu. Eu lobortis elementum nibh tellus molestie. Ornare lectus sit amet est placerat. Faucibus a pellentesque sit amet porttitor eget. Ornare quam viverra orci sagittis eu volutpat. Imperdiet nulla malesuada pellentesque elit eget gravida cum. Ultricies mi eget mauris pharetra et ultrices neque. Venenatis cras sed felis eget. Massa tempor nec feugiat nisl pretium fusce id velit. Quis blandit turpis cursus in hac. Sit amet consectetur adipiscing elit duis tristique sollicitudin nibh sit. Velit ut tortor pretium viverra suspendisse. Arcu odio ut sem nulla pharetra diam sit amet. Aliquet lectus proin nibh nisl condimentum. Sit amet consectetur adipiscing elit ut aliquam purus. A erat nam at lectus. Consequat id porta nibh venenatis cras sed felis.\n" +
                "\n" +
                "Convallis convallis tellus id interdum velit laoreet id donec. Elit ut aliquam purus sit amet luctus venenatis lectus magna. Quis auctor elit sed vulputate mi sit. Turpis egestas sed tempus urna et pharetra pharetra massa. Augue lacus viverra vitae congue eu. Est ante in nibh mauris cursus mattis molestie a. Ridiculus mus mauris vitae ultricies leo integer malesuada nunc. Odio facilisis mauris sit amet massa vitae tortor condimentum. Suspendisse in est ante in nibh. Nisl condimentum id venenatis a condimentum vitae. Sit amet luctus venenatis lectus magna fringilla urna. Gravida in fermentum et sollicitudin ac orci phasellus egestas tellus. Vivamus at augue eget arcu dictum varius duis at. Nisl vel pretium lectus quam.\n" +
                "\n" +
                "Nibh sit amet commodo nulla. Cras ornare arcu dui vivamus arcu. Porttitor leo a diam sollicitudin tempor. Non sodales neque sodales ut. Quisque egestas diam in arcu cursus euismod. Aenean euismod elementum nisi quis eleifend quam adipiscing vitae. Vulputate enim nulla aliquet porttitor lacus luctus. Vel pharetra vel turpis nunc eget lorem dolor sed. Tortor id aliquet lectus proin nibh. Odio eu feugiat pretium nibh ipsum consequat.\n" +
                "\n" +
                "Vitae et leo duis ut diam quam nulla porttitor. Lorem ipsum dolor sit amet consectetur adipiscing elit duis tristique. Consectetur libero id faucibus nisl tincidunt. Ante in nibh mauris cursus mattis molestie a iaculis at. Id consectetur purus ut faucibus pulvinar elementum integer enim neque. Ullamcorper morbi tincidunt ornare massa eget egestas purus. Vitae semper quis lectus nulla at volutpat diam. Volutpat consequat mauris nunc congue nisi vitae suscipit tellus mauris. Ut tellus elementum sagittis vitae et leo. Fermentum et sollicitudin ac orci phasellus egestas tellus rutrum. Fermentum leo vel orci porta non. Et molestie ac feugiat sed lectus vestibulum mattis ullamcorper. Enim neque volutpat ac tincidunt vitae semper quis lectus. Tempus quam pellentesque nec nam. Eleifend quam adipiscing vitae proin sagittis nisl rhoncus mattis. Volutpat est velit egestas dui id. Ac placerat vestibulum lectus mauris ultrices eros in cursus. Ligula ullamcorper malesuada proin libero nunc.\n" +
                "\n" +
                "Id nibh tortor id aliquet lectus proin nibh. Id interdum velit laoreet id donec ultrices. Egestas sed sed risus pretium quam vulputate dignissim. Accumsan in nisl nisi scelerisque eu. In cursus turpis massa tincidunt dui ut ornare lectus sit. Pretium nibh ipsum consequat nisl vel pretium lectus. Convallis tellus id interdum velit laoreet. Arcu cursus euismod quis viverra nibh cras pulvinar. Facilisis leo vel fringilla est ullamcorper eget nulla facilisi. Laoreet sit amet cursus sit amet dictum sit amet. Gravida rutrum quisque non tellus orci.\n" +
                "\n" +
                "Leo urna molestie at elementum eu facilisis. Integer malesuada nunc vel risus. Nisi vitae suscipit tellus mauris a diam maecenas. Laoreet id donec ultrices tincidunt arcu non. Velit egestas dui id ornare arcu odio ut sem nulla. Pellentesque dignissim enim sit amet. Consectetur libero id faucibus nisl tincidunt eget nullam non nisi. Eros donec ac odio tempor orci dapibus ultrices. Dictum non consectetur a erat. Id porta nibh venenatis cras sed felis eget velit. At in tellus integer feugiat scelerisque varius morbi enim nunc. Magna fringilla urna porttitor rhoncus. Et pharetra pharetra massa massa. Vehicula ipsum a arcu cursus vitae congue mauris.\n" +
                "\n" +
                "Libero volutpat sed cras ornare arcu dui. Nibh ipsum consequat nisl vel pretium lectus quam. Nulla porttitor massa id neque aliquam vestibulum morbi blandit cursus. Nisi vitae suscipit tellus mauris a diam. Erat imperdiet sed euismod nisi porta lorem mollis aliquam ut. Tincidunt praesent semper feugiat nibh sed pulvinar proin gravida. Pellentesque pulvinar pellentesque habitant morbi tristique senectus et. Proin sed libero enim sed faucibus turpis. Etiam sit amet nisl purus in mollis nunc sed. Eget velit aliquet sagittis id consectetur purus ut faucibus pulvinar. Eu scelerisque felis imperdiet proin. Quisque id diam vel quam elementum pulvinar. Tempor nec feugiat nisl pretium fusce id. Et netus et malesuada fames ac turpis egestas. Fermentum et sollicitudin ac orci phasellus egestas. Placerat in egestas erat imperdiet sed euismod nisi porta lorem. Gravida neque convallis a cras semper auctor neque vitae tempus. Posuere ac ut consequat semper. Id diam vel quam elementum pulvinar etiam non. Nam libero justo laoreet sit amet cursus sit amet.\n" +
                "\n" +
                "Risus quis varius quam quisque id diam. Massa tincidunt dui ut ornare. Et malesuada fames ac turpis egestas. Sed risus pretium quam vulputate dignissim suspendisse in est ante. Integer enim neque volutpat ac. Commodo elit at imperdiet dui accumsan sit amet nulla facilisi. Egestas diam in arcu cursus. Vitae congue eu consequat ac felis. Et netus et malesuada fames ac turpis. Venenatis tellus in metus vulputate. At auctor urna nunc id. Id velit ut tortor pretium. Lectus urna duis convallis convallis tellus id interdum velit laoreet. Egestas sed sed risus pretium quam vulputate. Urna condimentum mattis pellentesque id nibh. Quis imperdiet massa tincidunt nunc pulvinar sapien. Sit amet facilisis magna etiam tempor orci eu lobortis. Auctor neque vitae tempus quam pellentesque.\n" +
                "\n" +
                "Dignissim diam quis enim lobortis scelerisque. Arcu cursus euismod quis viverra nibh cras pulvinar. Senectus et netus et malesuada fames ac turpis egestas maecenas. Elementum nibh tellus molestie nunc non blandit massa. Eu consequat ac felis donec. Eu facilisis sed odio morbi quis commodo odio. Facilisis leo vel fringilla est ullamcorper eget nulla. Turpis egestas pretium aenean pharetra. Convallis a cras semper auctor neque. Mauris pellentesque pulvinar pellentesque habitant morbi tristique. Malesuada bibendum arcu vitae elementum curabitur vitae nunc sed velit. Mauris sit amet massa vitae. Eu facilisis sed odio morbi. Nisi porta lorem mollis aliquam ut porttitor leo. Vel orci porta non pulvinar neque laoreet suspendisse interdum consectetur. Bibendum enim facilisis gravida neque convallis a cras. Varius sit amet mattis vulputate enim.\n" +
                "\n" +
                "Iaculis nunc sed augue lacus viverra vitae congue eu consequat. Adipiscing bibendum est ultricies integer quis auctor elit. Tristique nulla aliquet enim tortor at auctor urna. Eu mi bibendum neque egestas congue quisque. Amet porttitor eget dolor morbi non. Quam vulputate dignissim suspendisse in est ante. Vel quam elementum pulvinar etiam non quam lacus suspendisse. Purus non enim praesent elementum facilisis. Et malesuada fames ac turpis. A pellentesque sit amet porttitor eget dolor morbi non.\n" +
                "\n" +
                "Scelerisque purus semper eget duis. Tristique magna sit amet purus gravida quis blandit turpis cursus. Feugiat in fermentum posuere urna. Est ante in nibh mauris cursus mattis molestie a iaculis. Nibh cras pulvinar mattis nunc sed blandit. Eget est lorem ipsum dolor. Et netus et malesuada fames ac turpis egestas. Id interdum velit laoreet id donec ultrices tincidunt arcu non. Quis commodo odio aenean sed adipiscing diam donec adipiscing tristique. Sed egestas egestas fringilla phasellus.\n" +
                "\n" +
                "Odio euismod lacinia at quis risus sed. Scelerisque mauris pellentesque pulvinar pellentesque habitant morbi tristique senectus. Molestie at elementum eu facilisis. Nec ultrices dui sapien eget mi proin sed. Sapien pellentesque habitant morbi tristique senectus et. Porttitor lacus luctus accumsan tortor posuere. Habitant morbi tristique senectus et netus. Nunc sed blandit libero volutpat sed cras. Dictumst vestibulum rhoncus est pellentesque elit. Ultricies tristique nulla aliquet enim tortor at auctor. Felis bibendum ut tristique et egestas quis ipsum suspendisse. Aliquam etiam erat velit scelerisque in dictum non consectetur. Tincidunt vitae semper quis lectus nulla at volutpat. Maecenas pharetra convallis posuere morbi leo. Sed elementum tempus egestas sed sed risus pretium. Faucibus scelerisque eleifend donec pretium. Iaculis at erat pellentesque adipiscing. Non enim praesent elementum facilisis.\n" +
                "\n" +
                "Volutpat maecenas volutpat blandit aliquam etiam erat velit. Faucibus a pellentesque sit amet porttitor. Turpis egestas pretium aenean pharetra. Ac turpis egestas integer eget. Elementum sagittis vitae et leo duis ut diam quam nulla. Nullam eget felis eget nunc lobortis mattis aliquam faucibus. Pulvinar elementum integer enim neque volutpat. Eget nullam non nisi est sit amet. Ultricies mi eget mauris pharetra et ultrices neque ornare aenean. Bibendum est ultricies integer quis auctor elit sed.\n" +
                "\n" +
                "Dapibus ultrices in iaculis nunc sed. Lacinia at quis risus sed vulputate odio ut enim. Proin libero nunc consequat interdum varius. Pulvinar mattis nunc sed blandit libero volutpat sed cras ornare. Tincidunt augue interdum velit euismod. Donec adipiscing tristique risus nec feugiat in fermentum posuere urna. Quis varius quam quisque id diam vel quam elementum pulvinar. Aliquet bibendum enim facilisis gravida neque convallis a. Nunc congue nisi vitae suscipit tellus mauris a. Dui ut ornare lectus sit amet. Magna eget est lorem ipsum. Sagittis vitae et leo duis. Neque gravida in fermentum et sollicitudin ac orci phasellus. Mauris in aliquam sem fringilla ut morbi tincidunt. Est placerat in egestas erat. Elit pellentesque habitant morbi tristique. Eget egestas purus viverra accumsan. Velit euismod in pellentesque massa placerat duis. Semper auctor neque vitae tempus quam pellentesque nec. Neque laoreet suspendisse interdum consectetur libero id faucibus.\n" +
                "\n" +
                "Ornare massa eget egestas purus viverra accumsan in. Egestas integer eget aliquet nibh praesent tristique magna. Tortor consequat id porta nibh venenatis cras sed felis. Vulputate eu scelerisque felis imperdiet proin fermentum leo. Ante in nibh mauris cursus mattis. Vitae et leo duis ut diam quam nulla porttitor. Ullamcorper morbi tincidunt ornare massa eget egestas purus viverra accumsan. Ac turpis egestas integer eget aliquet nibh. Est placerat in egestas erat. Nam aliquam sem et tortor. Malesuada nunc vel risus commodo. Blandit cursus risus at ultrices mi tempus.\n" +
                "\n" +
                "Sed pulvinar proin gravida hendrerit lectus a. Vitae nunc sed velit dignissim sodales. Euismod lacinia at quis risus sed vulputate odio ut enim. Gravida cum sociis natoque penatibus. Quis imperdiet massa tincidunt nunc pulvinar. Aliquet sagittis id consectetur purus. Aliquet nibh praesent tristique magna. Quis eleifend quam adipiscing vitae proin sagittis. Nibh tortor id aliquet lectus proin nibh nisl condimentum id. Nullam non nisi est sit amet facilisis magna etiam tempor. Vel risus commodo viverra maecenas accumsan lacus. Lorem mollis aliquam ut porttitor leo a diam. Id donec ultrices tincidunt arcu non sodales. Vitae et leo duis ut. Eget felis eget nunc lobortis. Laoreet suspendisse interdum consectetur libero id faucibus nisl tincidunt.\n" +
                "\n" +
                "Est lorem ipsum dolor sit amet. Molestie at elementum eu facilisis sed odio morbi quis. Nibh tortor id aliquet lectus proin nibh nisl condimentum. Vestibulum rhoncus est pellentesque elit ullamcorper dignissim cras tincidunt lobortis. A cras semper auctor neque vitae. Urna condimentum mattis pellentesque id nibh. Integer eget aliquet nibh praesent. Est pellentesque elit ullamcorper dignissim. Arcu non odio euismod lacinia at quis risus sed vulputate. Consequat ac felis donec et. Magna fermentum iaculis eu non. Praesent elementum facilisis leo vel fringilla est ullamcorper. Sagittis purus sit amet volutpat consequat mauris nunc. Porttitor eget dolor morbi non arcu risus. Velit laoreet id donec ultrices tincidunt arcu non sodales neque.\n" +
                "\n" +
                "Nulla facilisi nullam vehicula ipsum a arcu cursus vitae congue. Odio pellentesque diam volutpat commodo sed egestas egestas fringilla phasellus. Sit amet dictum sit amet justo donec enim diam. Ornare massa eget egestas purus. Nam libero justo laoreet sit. Non quam lacus suspendisse faucibus interdum posuere lorem ipsum. Egestas pretium aenean pharetra magna ac. Egestas purus viverra accumsan in nisl nisi scelerisque eu. Id velit ut tortor pretium viverra suspendisse potenti. Elit sed vulputate mi sit amet. Senectus et netus et malesuada fames ac. Odio morbi quis commodo odio aenean sed adipiscing. Cras sed felis eget velit aliquet sagittis. Mi sit amet mauris commodo quis imperdiet. Sed enim ut sem viverra. Etiam dignissim diam quis enim lobortis scelerisque fermentum dui faucibus. Integer malesuada nunc vel risus. Aliquam sem fringilla ut morbi tincidunt augue interdum velit. Neque ornare aenean euismod elementum nisi.\n" +
                "\n" +
                "Et ligula ullamcorper malesuada proin. Nulla aliquet enim tortor at auctor urna nunc id. Pellentesque habitant morbi tristique senectus. Elit pellentesque habitant morbi tristique senectus et. Sagittis vitae et leo duis ut diam. Ultricies integer quis auctor elit sed. Risus sed vulputate odio ut. Duis at consectetur lorem donec massa sapien faucibus. Morbi tristique senectus et netus et. Non tellus orci ac auctor augue mauris augue neque. Egestas pretium aenean pharetra magna ac placerat. Sed risus pretium quam vulputate dignissim. Quam viverra orci sagittis eu volutpat odio facilisis. Suspendisse faucibus interdum posuere lorem ipsum dolor sit amet consectetur. Phasellus egestas tellus rutrum tellus pellentesque eu tincidunt. Tortor condimentum lacinia quis vel eros. Feugiat sed lectus vestibulum mattis. Risus quis varius quam quisque id diam vel quam. Pellentesque adipiscing commodo elit at imperdiet. Nibh tellus molestie nunc non.\n" +
                "\n" +
                "Risus sed vulputate odio ut enim blandit volutpat maecenas. Pretium fusce id velit ut tortor pretium viverra suspendisse potenti. Lobortis feugiat vivamus at augue eget arcu dictum varius. Fringilla phasellus faucibus scelerisque eleifend donec pretium. Diam phasellus vestibulum lorem sed risus. Cras fermentum odio eu feugiat pretium nibh ipsum consequat nisl. Tellus pellentesque eu tincidunt tortor. Massa tempor nec feugiat nisl pretium fusce id. Est pellentesque elit ullamcorper dignissim cras tincidunt lobortis feugiat vivamus. Ultrices neque ornare aenean euismod elementum nisi. Potenti nullam ac tortor vitae purus faucibus ornare suspendisse. Pharetra diam sit amet nisl suscipit adipiscing. Nisi porta lorem mollis aliquam ut. Enim diam vulputate ut pharetra sit amet aliquam id. Faucibus a pellentesque sit amet porttitor eget. Tellus in metus vulputate eu scelerisque felis imperdiet proin.\n" +
                "\n" +
                "Viverra justo nec ultrices dui sapien eget mi. Nunc scelerisque viverra mauris in aliquam sem fringilla ut. Et egestas quis ipsum suspendisse ultrices. Feugiat pretium nibh ipsum consequat nisl vel. Ut enim blandit volutpat maecenas volutpat blandit aliquam etiam. Quisque non tellus orci ac auctor augue mauris augue neque. Consectetur adipiscing elit ut aliquam purus sit amet luctus venenatis. Lacus suspendisse faucibus interdum posuere lorem ipsum dolor. Morbi tristique senectus et netus et malesuada. A scelerisque purus semper eget duis at tellus at urna. Ullamcorper sit amet risus nullam. Et magnis dis parturient montes nascetur ridiculus mus mauris. Sit amet justo donec enim diam vulputate. Dui nunc mattis enim ut tellus elementum sagittis vitae et.\n" +
                "\n" +
                "Turpis in eu mi bibendum neque. Pellentesque elit ullamcorper dignissim cras tincidunt lobortis feugiat vivamus. Laoreet id donec ultrices tincidunt arcu non. Pharetra sit amet aliquam id diam maecenas. At consectetur lorem donec massa sapien faucibus et molestie ac. Varius quam quisque id diam. Tortor consequat id porta nibh venenatis cras sed. Aliquam faucibus purus in massa tempor nec feugiat. Dolor purus non enim praesent elementum facilisis leo. Aliquet nibh praesent tristique magna sit amet. Quisque egestas diam in arcu cursus euismod. At quis risus sed vulputate odio ut enim. Sagittis aliquam malesuada bibendum arcu vitae elementum curabitur vitae. Sed tempus urna et pharetra pharetra massa. Massa id neque aliquam vestibulum morbi blandit cursus. Imperdiet sed euismod nisi porta lorem mollis aliquam. Et ultrices neque ornare aenean euismod elementum nisi quis. Est ultricies integer quis auctor. Magna sit amet purus gravida quis. Et netus et malesuada fames ac turpis.\n" +
                "\n" +
                "Justo eget magna fermentum iaculis. Scelerisque viverra mauris in aliquam. Sodales ut etiam sit amet nisl purus in mollis nunc. Fermentum odio eu feugiat pretium nibh ipsum. Lacus suspendisse faucibus interdum posuere. Egestas erat imperdiet sed euismod nisi porta lorem mollis aliquam. Diam volutpat commodo sed egestas egestas. Adipiscing tristique risus nec feugiat in fermentum posuere. Amet justo donec enim diam vulputate. Enim blandit volutpat maecenas volutpat blandit aliquam etiam erat. Tincidunt ornare massa eget egestas purus viverra accumsan in. Sed viverra ipsum nunc aliquet bibendum enim facilisis gravida.\n" +
                "\n" +
                "Egestas dui id ornare arcu odio ut sem nulla pharetra. Mattis pellentesque id nibh tortor id aliquet. Massa id neque aliquam vestibulum. Vitae suscipit tellus mauris a diam maecenas sed. Pretium quam vulputate dignissim suspendisse in. Viverra vitae congue eu consequat ac felis donec. Augue neque gravida in fermentum et sollicitudin ac orci. Suspendisse potenti nullam ac tortor vitae purus. Adipiscing elit duis tristique sollicitudin nibh sit amet. Congue eu consequat ac felis donec. Auctor eu augue ut lectus arcu bibendum at varius.\n" +
                "\n" +
                "Sed viverra tellus in hac. Mattis aliquam faucibus purus in massa tempor. Nunc congue nisi vitae suscipit tellus mauris a. Cum sociis natoque penatibus et magnis dis parturient montes nascetur. Leo in vitae turpis massa sed. Neque aliquam vestibulum morbi blandit cursus risus at ultrices. Quis viverra nibh cras pulvinar. Venenatis lectus magna fringilla urna porttitor rhoncus. Volutpat blandit aliquam etiam erat velit scelerisque in dictum. Egestas congue quisque egestas diam in arcu cursus euismod quis. Ut venenatis tellus in metus vulputate eu. Commodo viverra maecenas accumsan lacus vel. Sem viverra aliquet eget sit amet tellus cras.\n" +
                "\n" +
                "Ornare arcu odio ut sem nulla pharetra diam sit amet. Ultrices dui sapien eget mi. Enim sed faucibus turpis in. Mattis nunc sed blandit libero volutpat sed cras ornare arcu. Enim diam vulputate ut pharetra sit amet aliquam id diam. Sit amet tellus cras adipiscing enim eu turpis. Ut pharetra sit amet aliquam. Gravida arcu ac tortor dignissim convallis aenean. Quisque non tellus orci ac auctor augue. Cras semper auctor neque vitae tempus quam pellentesque nec nam. Vitae congue eu consequat ac felis donec et odio. Magna eget est lorem ipsum dolor. Sit amet consectetur adipiscing elit. Eget aliquet nibh praesent tristique magna sit.\n" +
                "\n" +
                "Fringilla phasellus faucibus scelerisque eleifend donec pretium. Turpis egestas maecenas pharetra convallis posuere morbi. Massa massa ultricies mi quis hendrerit dolor. Viverra aliquet eget sit amet. Arcu felis bibendum ut tristique et egestas. Magna sit amet purus gravida. Velit sed ullamcorper morbi tincidunt. Blandit aliquam etiam erat velit scelerisque in dictum non consectetur. Ipsum nunc aliquet bibendum enim facilisis gravida neque convallis. Euismod in pellentesque massa placerat. Sed velit dignissim sodales ut. Convallis aenean et tortor at. Et netus et malesuada fames ac turpis egestas. Blandit massa enim nec dui nunc.\n" +
                "\n" +
                "In eu mi bibendum neque. Amet porttitor eget dolor morbi non arcu risus quis varius. Arcu dictum varius duis at consectetur lorem. Adipiscing elit pellentesque habitant morbi tristique senectus et netus. Rutrum quisque non tellus orci ac auctor augue mauris augue. Facilisi etiam dignissim diam quis enim lobortis scelerisque fermentum dui. Mattis aliquam faucibus purus in. Vitae elementum curabitur vitae nunc. Iaculis nunc sed augue lacus viverra vitae congue eu consequat. Purus faucibus ornare suspendisse sed nisi lacus. Lorem ipsum dolor sit amet consectetur adipiscing elit. Pellentesque eu tincidunt tortor aliquam nulla facilisi cras. Tortor consequat id porta nibh venenatis cras. Dui accumsan sit amet nulla facilisi. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Consectetur purus ut faucibus pulvinar.\n" +
                "\n" +
                "Ipsum dolor sit amet consectetur adipiscing elit ut aliquam purus. Sem viverra aliquet eget sit amet tellus cras adipiscing. Malesuada proin libero nunc consequat interdum. Magna fermentum iaculis eu non. Nec ullamcorper sit amet risus. Tincidunt augue interdum velit euismod in pellentesque massa placerat. Habitant morbi tristique senectus et. Nullam ac tortor vitae purus faucibus ornare suspendisse sed. Maecenas ultricies mi eget mauris pharetra et ultrices. Natoque penatibus et magnis dis parturient montes nascetur ridiculus. Integer quis auctor elit sed vulputate mi. Adipiscing enim eu turpis egestas pretium aenean pharetra magna ac. Pretium quam vulputate dignissim suspendisse in est ante. Eget duis at tellus at urna. Vulputate ut pharetra sit amet. Id donec ultrices tincidunt arcu. Dolor morbi non arcu risus quis varius quam quisque id.\n" +
                "\n" +
                "Donec et odio pellentesque diam volutpat commodo sed egestas egestas. Tincidunt arcu non sodales neque sodales ut etiam. Commodo nulla facilisi nullam vehicula ipsum a arcu cursus vitae. Vulputate enim nulla aliquet porttitor lacus luctus accumsan tortor posuere. Egestas erat imperdiet sed euismod nisi porta lorem mollis. Mi in nulla posuere sollicitudin aliquam ultrices sagittis orci. Eget nunc lobortis mattis aliquam faucibus. Est ultricies integer quis auctor elit sed vulputate mi sit. Ornare massa eget egestas purus viverra accumsan in nisl. Odio morbi quis commodo odio. Curabitur gravida arcu ac tortor. Diam ut venenatis tellus in metus vulputate. Auctor eu augue ut lectus arcu. At in tellus integer feugiat scelerisque. Pellentesque massa placerat duis ultricies. Adipiscing elit pellentesque habitant morbi tristique senectus et netus. Pellentesque habitant morbi tristique senectus et netus et malesuada. Arcu risus quis varius quam quisque id diam vel. Fermentum leo vel orci porta non pulvinar.\n" +
                "\n" +
                "Egestas dui id ornare arcu odio. Non blandit massa enim nec dui nunc mattis enim. Justo eget magna fermentum iaculis eu non. Auctor neque vitae tempus quam pellentesque nec nam aliquam sem. Id donec ultrices tincidunt arcu non sodales neque. Diam volutpat commodo sed egestas egestas. Phasellus vestibulum lorem sed risus ultricies tristique. Quis risus sed vulputate odio ut. Odio pellentesque diam volutpat commodo. Ullamcorper sit amet risus nullam eget felis. Sed turpis tincidunt id aliquet risus. Bibendum at varius vel pharetra vel turpis nunc. Aliquam malesuada bibendum arcu vitae elementum. Orci porta non pulvinar neque laoreet. At urna condimentum mattis pellentesque id nibh tortor id aliquet.\n" +
                "\n" +
                "Eget nulla facilisi etiam dignissim diam. Quis lectus nulla at volutpat. At augue eget arcu dictum. Iaculis at erat pellentesque adipiscing commodo elit at imperdiet. Mus mauris vitae ultricies leo integer. Velit aliquet sagittis id consectetur. Suspendisse interdum consectetur libero id faucibus nisl tincidunt. Sed cras ornare arcu dui vivamus arcu felis bibendum ut. Cursus metus aliquam eleifend mi in nulla posuere. At volutpat diam ut venenatis tellus in metus vulputate eu. Tellus rutrum tellus pellentesque eu. Vivamus at augue eget arcu dictum.\n" +
                "\n" +
                "Blandit libero volutpat sed cras ornare. Accumsan in nisl nisi scelerisque eu ultrices vitae auctor. Tincidunt lobortis feugiat vivamus at augue eget arcu dictum. Ac auctor augue mauris augue neque. Ipsum a arcu cursus vitae congue mauris rhoncus aenean. Vulputate odio ut enim blandit volutpat maecenas. Facilisi morbi tempus iaculis urna id. Aenean sed adipiscing diam donec adipiscing tristique. Odio facilisis mauris sit amet massa vitae. Euismod nisi porta lorem mollis aliquam ut porttitor leo. Egestas purus viverra accumsan in. Sed enim ut sem viverra aliquet eget sit amet tellus.\n" +
                "\n" +
                "Gravida rutrum quisque non tellus orci ac. Sed viverra ipsum nunc aliquet bibendum enim facilisis. Turpis egestas maecenas pharetra convallis posuere. Tincidunt id aliquet risus feugiat in ante metus. Dolor sit amet consectetur adipiscing elit pellentesque habitant morbi. Lectus mauris ultrices eros in cursus turpis. Suspendisse interdum consectetur libero id faucibus nisl tincidunt. Eget magna fermentum iaculis eu non diam phasellus. Fermentum leo vel orci porta non pulvinar. Ac felis donec et odio pellentesque diam volutpat commodo. Nullam ac tortor vitae purus faucibus ornare suspendisse.\n" +
                "\n" +
                "Id faucibus nisl tincidunt eget nullam non nisi. Feugiat sed lectus vestibulum mattis ullamcorper velit sed ullamcorper morbi. Tempor commodo ullamcorper a lacus. Lacinia at quis risus sed vulputate. Velit sed ullamcorper morbi tincidunt ornare. Sed velit dignissim sodales ut eu. Pretium viverra suspendisse potenti nullam ac tortor vitae purus. Velit euismod in pellentesque massa placerat duis ultricies lacus. Ac turpis egestas maecenas pharetra convallis posuere morbi. Turpis massa tincidunt dui ut ornare lectus sit amet. Nisi est sit amet facilisis magna etiam tempor. Fermentum iaculis eu non diam phasellus vestibulum lorem. Fermentum odio eu feugiat pretium nibh ipsum consequat. Tincidunt augue interdum velit euismod in pellentesque massa placerat duis. Dolor sit amet consectetur adipiscing elit. Congue eu consequat ac felis donec et odio.\n" +
                "\n" +
                "Adipiscing elit pellentesque habitant morbi tristique senectus et netus et. Quis varius quam quisque id. Viverra orci sagittis eu volutpat. Congue mauris rhoncus aenean vel elit. Mauris commodo quis imperdiet massa tincidunt nunc pulvinar sapien. Aliquet porttitor lacus luctus accumsan tortor posuere ac ut consequat. Egestas dui id ornare arcu odio ut sem nulla pharetra. Viverra maecenas accumsan lacus vel facilisis volutpat est. Tristique sollicitudin nibh sit amet commodo nulla. At urna condimentum mattis pellentesque id nibh tortor id. Donec ac odio tempor orci dapibus ultrices in iaculis. Fermentum iaculis eu non diam phasellus vestibulum. Magna ac placerat vestibulum lectus mauris ultrices eros in.\n" +
                "\n" +
                "Eget egestas purus viverra accumsan in nisl nisi scelerisque. Id faucibus nisl tincidunt eget nullam. Imperdiet massa tincidunt nunc pulvinar sapien et ligula. Nunc aliquet bibendum enim facilisis. Posuere lorem ipsum dolor sit amet consectetur adipiscing elit. Morbi tempus iaculis urna id volutpat lacus laoreet non curabitur. Sed velit dignissim sodales ut eu sem integer vitae justo. Scelerisque felis imperdiet proin fermentum leo. At volutpat diam ut venenatis tellus in metus vulputate. Morbi tincidunt ornare massa eget. Vitae et leo duis ut diam quam nulla porttitor. Senectus et netus et malesuada fames ac turpis egestas. Posuere ac ut consequat semper viverra nam libero justo laoreet. Sit amet mauris commodo quis imperdiet. Ut lectus arcu bibendum at varius vel pharetra vel. Risus ultricies tristique nulla aliquet enim. Eleifend donec pretium vulputate sapien nec. Quam lacus suspendisse faucibus interdum posuere lorem.";
        simpleStorage.put("org.giant.text",giantText);

        assertEquals(simpleStorage.get("org.giant.text"),giantText);

    }

    @Test
    void testRepeatedValues(){
        SimpleStorage SimpleStorage = new SimpleStorage();
        SimpleStorage.put("teste","valueA");
        SimpleStorage.put("teste","valueB");
        SimpleStorage.put("teste","valueC");
        SimpleStorage.put("teste","valueD");
        SimpleStorage.put("teste","valueE");

        Assertions.assertEquals("valueE",SimpleStorage.get("teste"));
    }


    @Test
    void testNewDB(){
        File anotherDB = new File("another.db");
        if(anotherDB.exists()) anotherDB.delete();
        SimpleStorage SimpleStorage = new SimpleStorage("another.db");
        Assertions.assertDoesNotThrow(() -> SimpleStorage.put("teste","valueA"));
        Assertions.assertEquals("valueA",SimpleStorage.get("teste"));
    }
}
