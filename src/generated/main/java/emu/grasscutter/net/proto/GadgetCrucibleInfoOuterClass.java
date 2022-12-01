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

public final class GadgetCrucibleInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_GadgetCrucibleInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GadgetCrucibleInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GadgetCrucibleInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GadgetCrucibleInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018GadgetCrucibleInfo.proto\"B\n\u0012GadgetCrucibleInfo\u0012\u0012\n\nmp_play_id\u0018\u0001 \u0001(\r\u0012\u0018\n\u0010prepare_end_time\u0018\u0002 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GadgetCrucibleInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_GadgetCrucibleInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GadgetCrucibleInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GadgetCrucibleInfoOuterClass.internal_static_GadgetCrucibleInfo_descriptor, new String[] { "MpPlayId", "PrepareEndTime" });
    }
    
    public static final class GadgetCrucibleInfo extends GeneratedMessageV3 implements GadgetCrucibleInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MP_PLAY_ID_FIELD_NUMBER = 1;
        private int mpPlayId_;
        public static final int PREPARE_END_TIME_FIELD_NUMBER = 2;
        private int prepareEndTime_;
        private byte memoizedIsInitialized;
        private static final GadgetCrucibleInfo DEFAULT_INSTANCE;
        private static final Parser<GadgetCrucibleInfo> PARSER;
        
        private GadgetCrucibleInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GadgetCrucibleInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GadgetCrucibleInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GadgetCrucibleInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.mpPlayId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.prepareEndTime_ = input.readUInt32();
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
            return GadgetCrucibleInfoOuterClass.internal_static_GadgetCrucibleInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GadgetCrucibleInfoOuterClass.internal_static_GadgetCrucibleInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GadgetCrucibleInfo.class, Builder.class);
        }
        
        @Override
        public int getMpPlayId() {
            return this.mpPlayId_;
        }
        
        @Override
        public int getPrepareEndTime() {
            return this.prepareEndTime_;
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
            if (this.mpPlayId_ != 0) {
                output.writeUInt32(1, this.mpPlayId_);
            }
            if (this.prepareEndTime_ != 0) {
                output.writeUInt32(2, this.prepareEndTime_);
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
            if (this.mpPlayId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.mpPlayId_);
            }
            if (this.prepareEndTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.prepareEndTime_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GadgetCrucibleInfo)) {
                return super.equals(obj);
            }
            final GadgetCrucibleInfo other = (GadgetCrucibleInfo)obj;
            return this.getMpPlayId() == other.getMpPlayId() && this.getPrepareEndTime() == other.getPrepareEndTime() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getMpPlayId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getPrepareEndTime();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GadgetCrucibleInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GadgetCrucibleInfo.PARSER.parseFrom(data);
        }
        
        public static GadgetCrucibleInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GadgetCrucibleInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GadgetCrucibleInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GadgetCrucibleInfo.PARSER.parseFrom(data);
        }
        
        public static GadgetCrucibleInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GadgetCrucibleInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GadgetCrucibleInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GadgetCrucibleInfo.PARSER.parseFrom(data);
        }
        
        public static GadgetCrucibleInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GadgetCrucibleInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GadgetCrucibleInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GadgetCrucibleInfo.PARSER, input);
        }
        
        public static GadgetCrucibleInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GadgetCrucibleInfo.PARSER, input, extensionRegistry);
        }
        
        public static GadgetCrucibleInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GadgetCrucibleInfo.PARSER, input);
        }
        
        public static GadgetCrucibleInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GadgetCrucibleInfo.PARSER, input, extensionRegistry);
        }
        
        public static GadgetCrucibleInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GadgetCrucibleInfo.PARSER, input);
        }
        
        public static GadgetCrucibleInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GadgetCrucibleInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GadgetCrucibleInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GadgetCrucibleInfo prototype) {
            return GadgetCrucibleInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GadgetCrucibleInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GadgetCrucibleInfo getDefaultInstance() {
            return GadgetCrucibleInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<GadgetCrucibleInfo> parser() {
            return GadgetCrucibleInfo.PARSER;
        }
        
        @Override
        public Parser<GadgetCrucibleInfo> getParserForType() {
            return GadgetCrucibleInfo.PARSER;
        }
        
        @Override
        public GadgetCrucibleInfo getDefaultInstanceForType() {
            return GadgetCrucibleInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GadgetCrucibleInfo();
            PARSER = new AbstractParser<GadgetCrucibleInfo>() {
                @Override
                public GadgetCrucibleInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GadgetCrucibleInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GadgetCrucibleInfoOrBuilder
        {
            private int mpPlayId_;
            private int prepareEndTime_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GadgetCrucibleInfoOuterClass.internal_static_GadgetCrucibleInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GadgetCrucibleInfoOuterClass.internal_static_GadgetCrucibleInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GadgetCrucibleInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GadgetCrucibleInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.mpPlayId_ = 0;
                this.prepareEndTime_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GadgetCrucibleInfoOuterClass.internal_static_GadgetCrucibleInfo_descriptor;
            }
            
            @Override
            public GadgetCrucibleInfo getDefaultInstanceForType() {
                return GadgetCrucibleInfo.getDefaultInstance();
            }
            
            @Override
            public GadgetCrucibleInfo build() {
                final GadgetCrucibleInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GadgetCrucibleInfo buildPartial() {
                final GadgetCrucibleInfo result = new GadgetCrucibleInfo(this);
                result.mpPlayId_ = this.mpPlayId_;
                result.prepareEndTime_ = this.prepareEndTime_;
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
                if (other instanceof GadgetCrucibleInfo) {
                    return this.mergeFrom((GadgetCrucibleInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GadgetCrucibleInfo other) {
                if (other == GadgetCrucibleInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getMpPlayId() != 0) {
                    this.setMpPlayId(other.getMpPlayId());
                }
                if (other.getPrepareEndTime() != 0) {
                    this.setPrepareEndTime(other.getPrepareEndTime());
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
                GadgetCrucibleInfo parsedMessage = null;
                try {
                    parsedMessage = GadgetCrucibleInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GadgetCrucibleInfo)e.getUnfinishedMessage();
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
            public int getMpPlayId() {
                return this.mpPlayId_;
            }
            
            public Builder setMpPlayId(final int value) {
                this.mpPlayId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMpPlayId() {
                this.mpPlayId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getPrepareEndTime() {
                return this.prepareEndTime_;
            }
            
            public Builder setPrepareEndTime(final int value) {
                this.prepareEndTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPrepareEndTime() {
                this.prepareEndTime_ = 0;
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
    
    public interface GadgetCrucibleInfoOrBuilder extends MessageOrBuilder
    {
        int getMpPlayId();
        
        int getPrepareEndTime();
    }
}
