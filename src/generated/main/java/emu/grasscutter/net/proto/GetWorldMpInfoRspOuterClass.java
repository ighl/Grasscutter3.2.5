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
import com.google.protobuf.Internal;
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

public final class GetWorldMpInfoRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetWorldMpInfoRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetWorldMpInfoRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetWorldMpInfoRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetWorldMpInfoRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017GetWorldMpInfoRsp.proto\"W\n\u0011GetWorldMpInfoRsp\u0012\u000f\n\u0007retcode\u0018\f \u0001(\u0005\u0012\u0015\n\ris_in_mp_mode\u0018\u0001 \u0001(\b\u0012\u001a\n\u0012quit_mp_valid_time\u0018\t \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetWorldMpInfoRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_GetWorldMpInfoRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetWorldMpInfoRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetWorldMpInfoRspOuterClass.internal_static_GetWorldMpInfoRsp_descriptor, new String[] { "Retcode", "IsInMpMode", "QuitMpValidTime" });
    }
    
    public static final class GetWorldMpInfoRsp extends GeneratedMessageV3 implements GetWorldMpInfoRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 12;
        private int retcode_;
        public static final int IS_IN_MP_MODE_FIELD_NUMBER = 1;
        private boolean isInMpMode_;
        public static final int QUIT_MP_VALID_TIME_FIELD_NUMBER = 9;
        private int quitMpValidTime_;
        private byte memoizedIsInitialized;
        private static final GetWorldMpInfoRsp DEFAULT_INSTANCE;
        private static final Parser<GetWorldMpInfoRsp> PARSER;
        
        private GetWorldMpInfoRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GetWorldMpInfoRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetWorldMpInfoRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetWorldMpInfoRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.isInMpMode_ = input.readBool();
                            continue;
                        }
                        case 72: {
                            this.quitMpValidTime_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
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
            return GetWorldMpInfoRspOuterClass.internal_static_GetWorldMpInfoRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetWorldMpInfoRspOuterClass.internal_static_GetWorldMpInfoRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetWorldMpInfoRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public boolean getIsInMpMode() {
            return this.isInMpMode_;
        }
        
        @Override
        public int getQuitMpValidTime() {
            return this.quitMpValidTime_;
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
            if (this.isInMpMode_) {
                output.writeBool(1, this.isInMpMode_);
            }
            if (this.quitMpValidTime_ != 0) {
                output.writeUInt32(9, this.quitMpValidTime_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(12, this.retcode_);
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
            if (this.isInMpMode_) {
                size += CodedOutputStream.computeBoolSize(1, this.isInMpMode_);
            }
            if (this.quitMpValidTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.quitMpValidTime_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(12, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetWorldMpInfoRsp)) {
                return super.equals(obj);
            }
            final GetWorldMpInfoRsp other = (GetWorldMpInfoRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getIsInMpMode() == other.getIsInMpMode() && this.getQuitMpValidTime() == other.getQuitMpValidTime() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 1;
            hash = 53 * hash + Internal.hashBoolean(this.getIsInMpMode());
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getQuitMpValidTime();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetWorldMpInfoRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetWorldMpInfoRsp.PARSER.parseFrom(data);
        }
        
        public static GetWorldMpInfoRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetWorldMpInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetWorldMpInfoRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetWorldMpInfoRsp.PARSER.parseFrom(data);
        }
        
        public static GetWorldMpInfoRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetWorldMpInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetWorldMpInfoRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetWorldMpInfoRsp.PARSER.parseFrom(data);
        }
        
        public static GetWorldMpInfoRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetWorldMpInfoRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetWorldMpInfoRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetWorldMpInfoRsp.PARSER, input);
        }
        
        public static GetWorldMpInfoRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetWorldMpInfoRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetWorldMpInfoRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetWorldMpInfoRsp.PARSER, input);
        }
        
        public static GetWorldMpInfoRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetWorldMpInfoRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetWorldMpInfoRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetWorldMpInfoRsp.PARSER, input);
        }
        
        public static GetWorldMpInfoRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetWorldMpInfoRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetWorldMpInfoRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetWorldMpInfoRsp prototype) {
            return GetWorldMpInfoRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetWorldMpInfoRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetWorldMpInfoRsp getDefaultInstance() {
            return GetWorldMpInfoRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetWorldMpInfoRsp> parser() {
            return GetWorldMpInfoRsp.PARSER;
        }
        
        @Override
        public Parser<GetWorldMpInfoRsp> getParserForType() {
            return GetWorldMpInfoRsp.PARSER;
        }
        
        @Override
        public GetWorldMpInfoRsp getDefaultInstanceForType() {
            return GetWorldMpInfoRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetWorldMpInfoRsp();
            PARSER = new AbstractParser<GetWorldMpInfoRsp>() {
                @Override
                public GetWorldMpInfoRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetWorldMpInfoRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetWorldMpInfoRspOrBuilder
        {
            private int retcode_;
            private boolean isInMpMode_;
            private int quitMpValidTime_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetWorldMpInfoRspOuterClass.internal_static_GetWorldMpInfoRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetWorldMpInfoRspOuterClass.internal_static_GetWorldMpInfoRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetWorldMpInfoRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetWorldMpInfoRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.isInMpMode_ = false;
                this.quitMpValidTime_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetWorldMpInfoRspOuterClass.internal_static_GetWorldMpInfoRsp_descriptor;
            }
            
            @Override
            public GetWorldMpInfoRsp getDefaultInstanceForType() {
                return GetWorldMpInfoRsp.getDefaultInstance();
            }
            
            @Override
            public GetWorldMpInfoRsp build() {
                final GetWorldMpInfoRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetWorldMpInfoRsp buildPartial() {
                final GetWorldMpInfoRsp result = new GetWorldMpInfoRsp(this);
                result.retcode_ = this.retcode_;
                result.isInMpMode_ = this.isInMpMode_;
                result.quitMpValidTime_ = this.quitMpValidTime_;
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
                if (other instanceof GetWorldMpInfoRsp) {
                    return this.mergeFrom((GetWorldMpInfoRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetWorldMpInfoRsp other) {
                if (other == GetWorldMpInfoRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getIsInMpMode()) {
                    this.setIsInMpMode(other.getIsInMpMode());
                }
                if (other.getQuitMpValidTime() != 0) {
                    this.setQuitMpValidTime(other.getQuitMpValidTime());
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
                GetWorldMpInfoRsp parsedMessage = null;
                try {
                    parsedMessage = GetWorldMpInfoRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetWorldMpInfoRsp)e.getUnfinishedMessage();
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
            public boolean getIsInMpMode() {
                return this.isInMpMode_;
            }
            
            public Builder setIsInMpMode(final boolean value) {
                this.isInMpMode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsInMpMode() {
                this.isInMpMode_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getQuitMpValidTime() {
                return this.quitMpValidTime_;
            }
            
            public Builder setQuitMpValidTime(final int value) {
                this.quitMpValidTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearQuitMpValidTime() {
                this.quitMpValidTime_ = 0;
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
    
    public interface GetWorldMpInfoRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        boolean getIsInMpMode();
        
        int getQuitMpValidTime();
    }
}
