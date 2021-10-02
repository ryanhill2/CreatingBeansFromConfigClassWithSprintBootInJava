package myGroup.myArtifact;

import org.springframework.beans.factory.annotation.Autowired;

public class IPhone {
    @Autowired
    MobileCPUProcessor _CPU;

    public MobileCPUProcessor getCpu() {
        return _CPU;
    }

    public void setCpu(MobileCPUProcessor cpu) {
        this._CPU = cpu;
    }

    public void CallIPhoneCPUProcess(){
        System.out.println("This Iphone was released in 2020");
        _CPU.DisplayIphoneProcessorType();
    }
}
