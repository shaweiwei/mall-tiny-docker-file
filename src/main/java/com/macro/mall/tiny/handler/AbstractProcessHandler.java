package com.macro.mall.tiny.handler;

import com.macro.mall.tiny.config.ProcessStep;
import com.macro.mall.tiny.dto.ProcessRequestDTO;
import lombok.Data;

/**
 * @author shamo
 */
@Data
public abstract class AbstractProcessHandler {

    protected ProcessStep processStep;
    protected AbstractProcessHandler nextProcessHandler;

    public void dealWithRequest(ProcessRequestDTO processRequestDTO){
        handle(processRequestDTO);
        if (nextProcessHandler != null){
            nextProcessHandler.dealWithRequest(processRequestDTO);
        }
    }

    abstract void handle(ProcessRequestDTO processRequestDTO);

}
