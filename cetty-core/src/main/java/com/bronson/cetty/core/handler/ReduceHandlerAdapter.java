package com.bronson.cetty.core.handler;

import com.bronson.cetty.core.Page;

/**
 * @author heyingcai
 */
public class ReduceHandlerAdapter implements ReduceHandler {

    @Override
    public void reduce(HandlerContext ctx, Page page) {
        ctx.fireReduce(page);
    }
}
