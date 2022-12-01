// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
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

public final class SetBattlePassViewedRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_SetBattlePassViewedRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SetBattlePassViewedRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SetBattlePassViewedRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SetBattlePassViewedRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cSetBattlePassViewedRsp.proto\">\n\u0016SetBattlePassViewedRsp\u0012\u0013\n\u000bschedule_id\u0018\u0002 \u0001(\r\u0012\u000f\n\u0007retcode\u0018\u0003 \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SetBattlePassViewedRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_SetBattlePassViewedRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SetBattlePassViewedRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SetBattlePassViewedRspOuterClass.internal_static_SetBattlePassViewedRsp_descriptor, new String[] { "ScheduleId", "Retcode" });
    }
    
    public static final class SetBattlePassViewedRsp extends GeneratedMessageV3 implements SetBattlePassViewedRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SCHEDULE_ID_FIELD_NUMBER = 2;
        private int scheduleId_;
        public static final int RETCODE_FIELD_NUMBER = 3;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final SetBattlePassViewedRsp DEFAULT_INSTANCE;
        private static final Parser<SetBattlePassViewedRsp> PARSER;
        
        private SetBattlePassViewedRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SetBattlePassViewedRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SetBattlePassViewedRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SetBattlePassViewedRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.scheduleId_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.retcode_ = input.readInt32();
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
            return SetBattlePassViewedRspOuterClass.internal_static_SetBattlePassViewedRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SetBattlePassViewedRspOuterClass.internal_static_SetBattlePassViewedRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(SetBattlePassViewedRsp.class, Builder.class);
        }
        
        @Override
        public int getScheduleId() {
            return this.scheduleId_;
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            if (this.scheduleId_ != 0) {
                output.writeUInt32(2, this.scheduleId_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(3, this.retcode_);
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
            if (this.scheduleId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.scheduleId_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(3, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetBattlePassViewedRsp)) {
                return super.equals(obj);
            }
            final SetBattlePassViewedRsp other = (SetBattlePassViewedRsp)obj;
            return this.getScheduleId() == other.getScheduleId() && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getScheduleId();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SetBattlePassViewedRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SetBattlePassViewedRsp.PARSER.parseFrom(data);
        }
        
        public static SetBattlePassViewedRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetBattlePassViewedRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetBattlePassViewedRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SetBattlePassViewedRsp.PARSER.parseFrom(data);
        }
        
        public static SetBattlePassViewedRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetBattlePassViewedRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetBattlePassViewedRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SetBattlePassViewedRsp.PARSER.parseFrom(data);
        }
        
        public static SetBattlePassViewedRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetBattlePassViewedRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetBattlePassViewedRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetBattlePassViewedRsp.PARSER, input);
        }
        
        public static SetBattlePassViewedRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetBattlePassViewedRsp.PARSER, input, extensionRegistry);
        }
        
        public static SetBattlePassViewedRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SetBattlePassViewedRsp.PARSER, input);
        }
        
        public static SetBattlePassViewedRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SetBattlePassViewedRsp.PARSER, input, extensionRegistry);
        }
        
        public static SetBattlePassViewedRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetBattlePassViewedRsp.PARSER, input);
        }
        
        public static SetBattlePassViewedRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetBattlePassViewedRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SetBattlePassViewedRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SetBattlePassViewedRsp prototype) {
            return SetBattlePassViewedRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SetBattlePassViewedRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SetBattlePassViewedRsp getDefaultInstance() {
            return SetBattlePassViewedRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<SetBattlePassViewedRsp> parser() {
            return SetBattlePassViewedRsp.PARSER;
        }
        
        @Override
        public Parser<SetBattlePassViewedRsp> getParserForType() {
            return SetBattlePassViewedRsp.PARSER;
        }
        
        @Override
        public SetBattlePassViewedRsp getDefaultInstanceForType() {
            return SetBattlePassViewedRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SetBattlePassViewedRsp();
            PARSER = new AbstractParser<SetBattlePassViewedRsp>() {
                @Override
                public SetBattlePassViewedRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SetBattlePassViewedRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetBattlePassViewedRspOrBuilder
        {
            private int scheduleId_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SetBattlePassViewedRspOuterClass.internal_static_SetBattlePassViewedRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SetBattlePassViewedRspOuterClass.internal_static_SetBattlePassViewedRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(SetBattlePassViewedRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SetBattlePassViewedRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.scheduleId_ = 0;
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SetBattlePassViewedRspOuterClass.internal_static_SetBattlePassViewedRsp_descriptor;
            }
            
            @Override
            public SetBattlePassViewedRsp getDefaultInstanceForType() {
                return SetBattlePassViewedRsp.getDefaultInstance();
            }
            
            @Override
            public SetBattlePassViewedRsp build() {
                final SetBattlePassViewedRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SetBattlePassViewedRsp buildPartial() {
                final SetBattlePassViewedRsp result = new SetBattlePassViewedRsp(this);
                result.scheduleId_ = this.scheduleId_;
                result.retcode_ = this.retcode_;
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
                if (other instanceof SetBattlePassViewedRsp) {
                    return this.mergeFrom((SetBattlePassViewedRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SetBattlePassViewedRsp other) {
                if (other == SetBattlePassViewedRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getScheduleId() != 0) {
                    this.setScheduleId(other.getScheduleId());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                SetBattlePassViewedRsp parsedMessage = null;
                try {
                    parsedMessage = SetBattlePassViewedRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SetBattlePassViewedRsp)e.getUnfinishedMessage();
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
            public int getScheduleId() {
                return this.scheduleId_;
            }
            
            public Builder setScheduleId(final int value) {
                this.scheduleId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearScheduleId() {
                this.scheduleId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
                return this;
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
    
    public interface SetBattlePassViewedRspOrBuilder extends MessageOrBuilder
    {
        int getScheduleId();
        
        int getRetcode();
    }
}
