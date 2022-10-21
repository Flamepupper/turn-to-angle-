/*package frc.robot.commands;
import java.io.File;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import edu.wpi.first.util.concurrent.Event;

public class midi {
    public static final int NOTE_ON = 0x90;
    public static final int NOTE_OFF = 0x80;
    //public static final String[] NOTE_NAMES = {"C", "CC", "D", "DD", "E", "F", "FF", "G", "GG", "A", "AA", "B"};
    //public static final double[] NOTE_NAMES = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
    public static final double[] NOTE_NAMES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    public static void main(String[] args) throws Exception {
        new File("/commands", "Song.mid");
        Sequence sequence = MidiSystem.getSequence(new File("/Users/dbratt24/Documents/loopRobot/src/main/java/frc/robot/commands/Song.mid"));
        int trackNumber = 0;
        for (Track track :  sequence.getTracks()) {
            trackNumber++;
            System.out.println("Track " + trackNumber + ": size = " + track.size());
            System.out.println();
            for (int i=0; i < track.size(); i++) { 
                MidiEvent event = track.get(i);
                System.out.print("@" + event.getTick() + " ");
                MidiMessage message = event.getMessage();
                if (message instanceof ShortMessage) {
                    ShortMessage sm = (ShortMessage) message;
                    System.out.print("Channel: " + sm.getChannel() + " ");
                    if (sm.getCommand() == NOTE_ON) {
                        int key = sm.getData1();
                        int octave = (key / 12)-1;
                        int note = key % 12;
                        double noteName = NOTE_NAMES[note];
                        int velocity = sm.getData2();
                       // System.out.println("Note on, " + noteName + octave + " key=" + key + " velocity: " + velocity);
                       System.out.println(noteName + " next " + octave + " key=" + key + " velocity: " + velocity);
                    //System.out.println("playing");
                    } else if (sm.getCommand() == NOTE_OFF) {
                        int key = sm.getData1();
                        int octave = (key / 12)-1;
                        int note = key % 12;
                        double noteName = NOTE_NAMES[note];
                        int velocity = sm.getData2();
                       // System.out.println("Note off, " + noteName + octave + " key=" + key + " velocity: " + velocity);
                        long timeB = ((event.getTick() / 512)*100);
                        int speaker = 0;
                        double speed = (((noteName / 12)/3)* velocity);
                        long TimerStart = 0;
                        System.currentTimeMillis() - TimerStart;


                    } else {
                        System.out.println("Command:" + sm.getCommand());
                    }
                } else {
                    System.out.println("Other message: " + message.getClass());

                   }

                }
            }

            System.out.println();
        }
    }*/