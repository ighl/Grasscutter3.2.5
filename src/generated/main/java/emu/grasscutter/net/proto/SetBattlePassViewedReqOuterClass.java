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

public final class SetBattlePassViewedReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_SetBattlePassViewedReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SetBattlePassViewedReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SetBattlePassViewedReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SetBattlePassViewedReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cSetBattlePassViewedReq.proto\"-\n\u0016SetBattlePassViewedReq\u0012\u0013\n\u000bschedule_id\u0018\u0006 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SetBattlePassViewedReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_SetBattlePassViewedReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SetBattlePassViewedReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SetBattlePassViewedReqOuterClass.internal_static_SetBattlePassViewedReq_descriptor, new String[] { "ScheduleId" });
    }
    
    public static final class SetBattlePassViewedReq extends GeneratedMessageV3 implements SetBattlePassViewedReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SCHEDULE_ID_FIELD_NUMBER = 6;
        private int scheduleId_;
        private byte memoizedIsInitialized;
        private static final SetBattlePassViewedReq DEFAULT_INSTANCE;
        private static final Parser<SetBattlePassViewedReq> PARSER;
        
        private SetBattlePassViewedReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SetBattlePassViewedReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SetBattlePassViewedReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SetBattlePassViewedReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 48: {
                            this.scheduleId_ = input.readUInt32();
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
            return SetBattlePassViewedReqOuterClass.internal_static_SetBattlePassViewedReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SetBattlePassViewedReqOuterClass.internal_static_SetBattlePassViewedReq_fieldAccessorTable.ensureFieldAccessorsInitialized(SetBattlePassViewedReq.class, Builder.class);
        }
        
        @Override
        public int getScheduleId() {
            return this.scheduleId_;
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
                output.writeUInt32(6, this.scheduleId_);
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
                size += CodedOutputStream.computeUInt32Size(6, this.scheduleId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetBattlePassViewedReq)) {
                return super.equals(obj);
            }
            final SetBattlePassViewedReq other = (SetBattlePassViewedReq)obj;
            return this.getScheduleId() == other.getScheduleId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getScheduleId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SetBattlePassViewedReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SetBattlePassViewedReq.PARSER.parseFrom(data);
        }
        
        public static SetBattlePassViewedReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetBattlePassViewedReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetBattlePassViewedReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SetBattlePassViewedReq.PARSER.parseFrom(data);
        }
        
        public static SetBattlePassViewedReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetBattlePassViewedReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetBattlePassViewedReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SetBattlePassViewedReq.PARSER.parseFrom(data);
        }
        
        public static SetBattlePassViewedReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetBattlePassViewedReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetBattlePassViewedReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetBattlePassViewedReq.PARSER, input);
        }
        
        public static SetBattlePassViewedReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetBattlePassViewedReq.PARSER, input, extensionRegistry);
        }
        
        public static SetBattlePassViewedReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SetBattlePassViewedReq.PARSER, input);
        }
        
        public static SetBattlePassViewedReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SetBattlePassViewedReq.PARSER, input, extensionRegistry);
        }
        
        public static SetBattlePassViewedReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetBattlePassViewedReq.PARSER, input);
        }
        
        public static SetBattlePassViewedReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetBattlePassViewedReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SetBattlePassViewedReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SetBattlePassViewedReq prototype) {
            return SetBattlePassViewedReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SetBattlePassViewedReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SetBattlePassViewedReq getDefaultInstance() {
            return SetBattlePassViewedReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<SetBattlePassViewedReq> parser() {
            return SetBattlePassViewedReq.PARSER;
        }
        
        @Override
        public Parser<SetBattlePassViewedReq> getParserForType() {
            return SetBattlePassViewedReq.PARSER;
        }
        
        @Override
        public SetBattlePassViewedReq getDefaultInstanceForType() {
            return SetBattlePassViewedReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SetBattlePassViewedReq();
            PARSER = new AbstractParser<SetBattlePassViewedReq>() {
                @Override
                public SetBattlePassViewedReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SetBattlePassViewedReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetBattlePassViewedReqOrBuilder
        {
            private int scheduleId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SetBattlePassViewedReqOuterClass.internal_static_SetBattlePassViewedReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SetBattlePassViewedReqOuterClass.internal_static_SetBattlePassViewedReq_fieldAccessorTable.ensureFieldAccessorsInitialized(SetBattlePassViewedReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SetBattlePassViewedReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.scheduleId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SetBattlePassViewedReqOuterClass.internal_static_SetBattlePassViewedReq_descriptor;
            }
            
            @Override
            public SetBattlePassViewedReq getDefaultInstanceForType() {
                return SetBattlePassViewedReq.getDefaultInstance();
            }
            
            @Override
            public SetBattlePassViewedReq build() {
                final SetBattlePassViewedReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SetBattlePassViewedReq buildPartial() {
                final SetBattlePassViewedReq result = new SetBattlePassViewedReq(this);
                result.scheduleId_ = this.scheduleId_;
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
                if (other instanceof SetBattlePassViewedReq) {
                    return this.mergeFrom((SetBattlePassViewedReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SetBattlePassViewedReq other) {
                if (other == SetBattlePassViewedReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getScheduleId() != 0) {
                    this.setScheduleId(other.getScheduleId());
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
                SetBattlePassViewedReq parsedMessage = null;
                try {
                    parsedMessage = SetBattlePassViewedReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SetBattlePassViewedReq)e.getUnfinishedMessage();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface SetBattlePassViewedReqOrBuilder extends MessageOrBuilder
    {
        int getScheduleId();
    }
}
