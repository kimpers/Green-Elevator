/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author villiam
 */
public class Command {

    public static enum Commands {
        b, p, q, m, d,
        s, w, v, f,UNKNOWN
    };
    public final Commands command;
    public final float velocity,position;
    public final int[] args;

    public Command(String cmd) {
        String[] cmdSplit = cmd.split(" ");
        switch (cmdSplit[0]) {
            case "b":
                this.command = Commands.b;
                args = new int[2];
                args[0] = Integer.parseInt(cmdSplit[1]);
                args[1] = Integer.parseInt(cmdSplit[2]);
                velocity = -1;
                position = -1;
                break;
            case "m":
                this.command = Commands.m;
                args = new int[2];
                args[0] = Integer.parseInt(cmdSplit[1]);
                args[1] = Integer.parseInt(cmdSplit[2]);
                velocity = -1;
                position = -1;
                break;
            case "d":
                this.command = Commands.d;
                args = new int[2];
                args[0] = Integer.parseInt(cmdSplit[1]);
                args[1] = Integer.parseInt(cmdSplit[2]);
                velocity = -1;
                position = -1;
                break;
            case "s":
                this.command = Commands.s;
                args = new int[2];
                args[0] = Integer.parseInt(cmdSplit[1]);
                args[1] = Integer.parseInt(cmdSplit[2]);
                velocity = -1;
                position = -1;
                break;
            case "f":
                this.command = Commands.f;
                args = new int[1];
                args[0] = Integer.parseInt(cmdSplit[1]);
                velocity = -1;
                position = Float.parseFloat(cmdSplit[2]);
                break;
            case "w":
                this.command = Commands.w;
                args = new int[1];
                args[0] = Integer.parseInt(cmdSplit[1]);
                velocity = -1;
                position = -1;
                break;
            case "v":
                this.command = Commands.v;
                velocity = Float.parseFloat(cmdSplit[1]);
                args = null;
                position = -1;
                break;
            case "p":
                this.command = Commands.p;
                args = new int[2];
                args[0] = Integer.parseInt(cmdSplit[1]);
                args[1] = Integer.parseInt(cmdSplit[2]);
                velocity = -1;
                position = -1;
                break;
            default:
                this.command = Commands.UNKNOWN;
                velocity = -1;
                args = null;
                position = -1;
                break;
        }
    }
    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append(command.toString());
        for(int i : args)
            sb.append(i).append(" ");

        sb.append(velocity).append(" ");
        sb.append(position).append(" ");
        return sb.toString();
    }

}
