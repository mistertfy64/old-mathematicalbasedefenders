package com.mathematicalbasedefenders.mathematicalbasedefenders.net;

import com.mathematicalbasedefenders.mathematicalbasedefenders.MathematicalBaseDefenders;

import static com.mathematicalbasedefenders.mathematicalbasedefenders.MathematicalBaseDefenders.core;

public class Authentication {


    // TODO: ENCRYPT PASSWORD (IMPORTANT)
    public static boolean loginWithCredentials(String username, String password) {

        core.toastNotificationQueue.add("Authenticating...");

        String encodedPassword = MathematicalBaseDefenders.utilities.encodeWithBase64(password, 4);
        MathematicalBaseDefenders.networking.socket.emit("authenticate", username, encodedPassword);


        return false;
    }


}
