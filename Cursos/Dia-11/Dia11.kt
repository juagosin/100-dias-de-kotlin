fun main(){
    //https://developer.android.com/codelabs/basic-android-kotlin-compose-classes-and-objects?hl=es-419#4

    //Profundizando en clases
    class SmartDevice {

        val name = "Android TV"
        val category = "Entertainment"
        var deviceStatus = "online"
        //Cuando no defines la función de método get y set para una propiedad, el compilador de Kotlin crea las funciones a nivel interno
        //var speakerVolume = 2, internamente sería:
        var speakerVolume = 2
            get() = field
            //Por ejemplo, para asegurarte de que el valor asignado a la propiedad speakerVolume esté en el rango de 0 a 100, puedes implementar la función set, como se muestra en este fragmento de código:
            set(value) {
                if (value in 0..100) {
                    field = value
                }
            }

        fun turnOn() {
            println("Smart device is turned on.")
        }

        fun turnOff() {
            println("Smart device is turned off.")
        }
    }

    val smartTv = SmartDevice()
    smartTv.speakerVolume = 150 //No da error pero no se ejecuta el set ya que hemos definido que sea un rango del 1 al 100
    println("Device name is: ${smartTv.name}")
    smartTv.turnOn()
    smartTv.turnOff()
    println(smartTv.speakerVolume)

    /*
    *  Relaciones entre clases, herencias
    *
    * */

    //Vamos a crear una clase "Padre" o "Superior", La palabra clave open informa al compilador que esta clase se puede extender, por lo que ahora otras clases pueden extenderla.
    open class SmartDevicePadre(val name: String, val category: String) {
        var deviceStatus = "online"

        fun turnOn() {
            println("Smart device is turned on.")
        }

        fun turnOff() {
            println("Smart device is turned off.")
        }
    }
    //Ahora vamos a crear una subclase que extiende de la clase padre
    class SmartTvDevice(deviceName: String, deviceCategory: String) :
        SmartDevicePadre(name = deviceName, category = deviceCategory) {
        var speakerVolume = 2
            set(value) {
                if (value in 0..100) {
                    field = value
                }
            }
        var channelNumber = 1
            set(value) {
                if (value in 0..200) {
                    field = value
                }
            }
        fun increaseSpeakerVolume() {
            speakerVolume++
            println("Speaker volume increased to $speakerVolume.")
        }
        fun nextChannel() {
            channelNumber++
            println("Channel number increased to $channelNumber.")
        }
    }

    //Declaramos otra subclase
    class SmartLightDevice(deviceName: String, deviceCategory: String) :
        SmartDevicePadre(name = deviceName, category = deviceCategory) {
        var brightnessLevel = 0
            set(value) {
                if (value in 0..100) {
                    field = value
                }
            }
        fun increaseBrightness() {
            brightnessLevel++
            println("Brightness increased to $brightnessLevel.")
        }
    }


    //Además de relaciones padre hijo existen las relaciones de tipo "composicion" o HAS-A
    class SmartHome(
        val smartTvDevice: SmartTvDevice,
        val smartLightDevice: SmartLightDevice) {

        fun turnOnTv() {
            smartTvDevice.turnOn()
        }

        fun turnOffTv() {
            smartTvDevice.turnOff()
        }

        fun increaseTvVolume() {
            smartTvDevice.increaseSpeakerVolume()
        }

        fun changeTvChannelToNext() {
            smartTvDevice.nextChannel()
        }
        fun turnOnLight() {
            smartLightDevice.turnOn()
        }

        fun turnOffLight() {
            smartLightDevice.turnOff()
        }
        fun increaseLightBrightness() {
            smartLightDevice.increaseBrightness()
        }
        fun turnOffAllDevices() {
            turnOffTv()
            turnOffLight()
        }

    }


}