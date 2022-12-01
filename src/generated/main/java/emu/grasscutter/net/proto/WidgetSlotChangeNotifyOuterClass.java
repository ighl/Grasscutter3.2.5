// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class WidgetSlotChangeNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_WidgetSlotChangeNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WidgetSlotChangeNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WidgetSlotChangeNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WidgetSlotChangeNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cWidgetSlotChangeNotify.proto\u001a\u0014WidgetSlotData.proto\u001a\u0012WidgetSlotOp.proto\"R\n\u0016WidgetSlotChangeNotify\u0012\u0019\n\u0002op\u0018\u000b \u0001(\u000e2\r.WidgetSlotOp\u0012\u001d\n\u0004slot\u0018\b \u0001(\u000b2\u000f.WidgetSlotDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WidgetSlotChangeNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { WidgetSlotDataOuterClass.getDescriptor(), WidgetSlotOpOuterClass.getDescriptor() });
        internal_static_WidgetSlotChangeNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WidgetSlotChangeNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WidgetSlotChangeNotifyOuterClass.internal_static_WidgetSlotChangeNotify_descriptor, new String[] { "Op", "Slot" });
        WidgetSlotDataOuterClass.getDescriptor();
        WidgetSlotOpOuterClass.getDescriptor();
    }
    
    public static final class WidgetSlotChangeNotify extends GeneratedMessageV3 implements WidgetSlotChangeNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int OP_FIELD_NUMBER = 11;
        private int op_;
        public static final int SLOT_FIELD_NUMBER = 8;
        private WidgetSlotDataOuterClass.WidgetSlotData slot_;
        private byte memoizedIsInitialized;
        private static final WidgetSlotChangeNotify DEFAULT_INSTANCE;
        private static final Parser<WidgetSlotChangeNotify> PARSER;
        
        private WidgetSlotChangeNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WidgetSlotChangeNotify() {
            this.memoizedIsInitialized = -1;
            this.op_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WidgetSlotChangeNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WidgetSlotChangeNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 66: {
                            WidgetSlotDataOuterClass.WidgetSlotData.Builder subBuilder = null;
                            if (this.slot_ != null) {
                                subBuilder = this.slot_.toBuilder();
                            }
                            this.slot_ = input.readMessage(WidgetSlotDataOuterClass.WidgetSlotData.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.slot_);
                                this.slot_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 88: {
                            final int rawValue = input.readEnum();
                            this.op_ = rawValue;
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return WidgetSlotChangeNotifyOuterClass.internal_static_WidgetSlotChangeNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WidgetSlotChangeNotifyOuterClass.internal_static_WidgetSlotChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetSlotChangeNotify.class, Builder.class);
        }
        
        @Override
        public int getOpValue() {
            return this.op_;
        }
        
        @Override
        public WidgetSlotOpOuterClass.WidgetSlotOp getOp() {
            final WidgetSlotOpOuterClass.WidgetSlotOp result = WidgetSlotOpOuterClass.WidgetSlotOp.valueOf(this.op_);
            return (result == null) ? WidgetSlotOpOuterClass.WidgetSlotOp.UNRECOGNIZED : result;
        }
        
        @Override
        public boolean hasSlot() {
            return this.slot_ != null;
        }
        
        @Override
        public WidgetSlotDataOuterClass.WidgetSlotData getSlot() {
            return (this.slot_ == null) ? WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance() : this.slot_;
        }
        
        @Override
        public WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotOrBuilder() {
            return this.getSlot();
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            if (this.slot_ != null) {
                output.writeMessage(8, this.getSlot());
            }
            if (this.op_ != WidgetSlotOpOuterClass.WidgetSlotOp.WIDGET_SLOT_OP_ATTACH.getNumber()) {
                output.writeEnum(11, this.op_);
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.slot_ != null) {
                size += CodedOutputStream.computeMessageSize(8, this.getSlot());
            }
            if (this.op_ != WidgetSlotOpOuterClass.WidgetSlotOp.WIDGET_SLOT_OP_ATTACH.getNumber()) {
                size += CodedOutputStream.computeEnumSize(11, this.op_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WidgetSlotChangeNotify)) {
                return super.equals(obj);
            }
            final WidgetSlotChangeNotify other = (WidgetSlotChangeNotify)obj;
            return this.op_ == other.op_ && this.hasSlot() == other.hasSlot() && (!this.hasSlot() || this.getSlot().equals(other.getSlot())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.op_;
            if (this.hasSlot()) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getSlot().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WidgetSlotChangeNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WidgetSlotChangeNotify.PARSER.parseFrom(data);
        }
        
        public static WidgetSlotChangeNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetSlotChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetSlotChangeNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WidgetSlotChangeNotify.PARSER.parseFrom(data);
        }
        
        public static WidgetSlotChangeNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetSlotChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetSlotChangeNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WidgetSlotChangeNotify.PARSER.parseFrom(data);
        }
        
        public static WidgetSlotChangeNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetSlotChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetSlotChangeNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetSlotChangeNotify.PARSER, input);
        }
        
        public static WidgetSlotChangeNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetSlotChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static WidgetSlotChangeNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetSlotChangeNotify.PARSER, input);
        }
        
        public static WidgetSlotChangeNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetSlotChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static WidgetSlotChangeNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetSlotChangeNotify.PARSER, input);
        }
        
        public static WidgetSlotChangeNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetSlotChangeNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WidgetSlotChangeNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WidgetSlotChangeNotify prototype) {
            return WidgetSlotChangeNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WidgetSlotChangeNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WidgetSlotChangeNotify getDefaultInstance() {
            return WidgetSlotChangeNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<WidgetSlotChangeNotify> parser() {
            return WidgetSlotChangeNotify.PARSER;
        }
        
        @Override
        public Parser<WidgetSlotChangeNotify> getParserForType() {
            return WidgetSlotChangeNotify.PARSER;
        }
        
        @Override
        public WidgetSlotChangeNotify getDefaultInstanceForType() {
            return WidgetSlotChangeNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WidgetSlotChangeNotify();
            PARSER = new AbstractParser<WidgetSlotChangeNotify>() {
                @Override
                public WidgetSlotChangeNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WidgetSlotChangeNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WidgetSlotChangeNotifyOrBuilder
        {
            private int op_;
            private WidgetSlotDataOuterClass.WidgetSlotData slot_;
            private SingleFieldBuilderV3<WidgetSlotDataOuterClass.WidgetSlotData, WidgetSlotDataOuterClass.WidgetSlotData.Builder, WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> slotBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WidgetSlotChangeNotifyOuterClass.internal_static_WidgetSlotChangeNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WidgetSlotChangeNotifyOuterClass.internal_static_WidgetSlotChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetSlotChangeNotify.class, Builder.class);
            }
            
            private Builder() {
                this.op_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.op_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WidgetSlotChangeNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.op_ = 0;
                if (this.slotBuilder_ == null) {
                    this.slot_ = null;
                }
                else {
                    this.slot_ = null;
                    this.slotBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WidgetSlotChangeNotifyOuterClass.internal_static_WidgetSlotChangeNotify_descriptor;
            }
            
            @Override
            public WidgetSlotChangeNotify getDefaultInstanceForType() {
                return WidgetSlotChangeNotify.getDefaultInstance();
            }
            
            @Override
            public WidgetSlotChangeNotify build() {
                final WidgetSlotChangeNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WidgetSlotChangeNotify buildPartial() {
                final WidgetSlotChangeNotify result = new WidgetSlotChangeNotify(this);
                result.op_ = this.op_;
                if (this.slotBuilder_ == null) {
                    result.slot_ = this.slot_;
                }
                else {
                    result.slot_ = this.slotBuilder_.build();
                }
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof WidgetSlotChangeNotify) {
                    return this.mergeFrom((WidgetSlotChangeNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WidgetSlotChangeNotify other) {
                if (other == WidgetSlotChangeNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.op_ != 0) {
                    this.setOpValue(other.getOpValue());
                }
                if (other.hasSlot()) {
                    this.mergeSlot(other.getSlot());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                WidgetSlotChangeNotify parsedMessage = null;
                try {
                    parsedMessage = WidgetSlotChangeNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WidgetSlotChangeNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public int getOpValue() {
                return this.op_;
            }
            
            public Builder setOpValue(final int value) {
                this.op_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public WidgetSlotOpOuterClass.WidgetSlotOp getOp() {
                final WidgetSlotOpOuterClass.WidgetSlotOp result = WidgetSlotOpOuterClass.WidgetSlotOp.valueOf(this.op_);
                return (result == null) ? WidgetSlotOpOuterClass.WidgetSlotOp.UNRECOGNIZED : result;
            }
            
            public Builder setOp(final WidgetSlotOpOuterClass.WidgetSlotOp value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.op_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearOp() {
                this.op_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasSlot() {
                return this.slotBuilder_ != null || this.slot_ != null;
            }
            
            @Override
            public WidgetSlotDataOuterClass.WidgetSlotData getSlot() {
                if (this.slotBuilder_ == null) {
                    return (this.slot_ == null) ? WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance() : this.slot_;
                }
                return this.slotBuilder_.getMessage();
            }
            
            public Builder setSlot(final WidgetSlotDataOuterClass.WidgetSlotData value) {
                if (this.slotBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.slot_ = value;
                    this.onChanged();
                }
                else {
                    this.slotBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setSlot(final WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
                if (this.slotBuilder_ == null) {
                    this.slot_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.slotBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeSlot(final WidgetSlotDataOuterClass.WidgetSlotData value) {
                if (this.slotBuilder_ == null) {
                    if (this.slot_ != null) {
                        this.slot_ = WidgetSlotDataOuterClass.WidgetSlotData.newBuilder(this.slot_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.slot_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.slotBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearSlot() {
                if (this.slotBuilder_ == null) {
                    this.slot_ = null;
                    this.onChanged();
                }
                else {
                    this.slot_ = null;
                    this.slotBuilder_ = null;
                }
                return this;
            }
            
            public WidgetSlotDataOuterClass.WidgetSlotData.Builder getSlotBuilder() {
                this.onChanged();
                return this.getSlotFieldBuilder().getBuilder();
            }
            
            @Override
            public WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotOrBuilder() {
                if (this.slotBuilder_ != null) {
                    return this.slotBuilder_.getMessageOrBuilder();
                }
                return (this.slot_ == null) ? WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance() : this.slot_;
            }
            
            private SingleFieldBuilderV3<WidgetSlotDataOuterClass.WidgetSlotData, WidgetSlotDataOuterClass.WidgetSlotData.Builder, WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> getSlotFieldBuilder() {
                if (this.slotBuilder_ == null) {
                    this.slotBuilder_ = new SingleFieldBuilderV3<WidgetSlotDataOuterClass.WidgetSlotData, WidgetSlotDataOuterClass.WidgetSlotData.Builder, WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder>(this.getSlot(), this.getParentForChildren(), this.isClean());
                    this.slot_ = null;
                }
                return this.slotBuilder_;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface WidgetSlotChangeNotifyOrBuilder extends MessageOrBuilder
    {
        int getOpValue();
        
        WidgetSlotOpOuterClass.WidgetSlotOp getOp();
        
        boolean hasSlot();
        
        WidgetSlotDataOuterClass.WidgetSlotData getSlot();
        
        WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotOrBuilder();
    }
}
