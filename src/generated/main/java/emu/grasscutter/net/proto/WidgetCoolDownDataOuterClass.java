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

public final class WidgetCoolDownDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_WidgetCoolDownData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WidgetCoolDownData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WidgetCoolDownDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WidgetCoolDownDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018WidgetCoolDownData.proto\"L\n\u0012WidgetCoolDownData\u0012\u0012\n\nis_success\u0018\u0005 \u0001(\b\u0012\u0016\n\u000ecool_down_time\u0018\u0004 \u0001(\u0004\u0012\n\n\u0002id\u0018\u000f \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WidgetCoolDownDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_WidgetCoolDownData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WidgetCoolDownData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WidgetCoolDownDataOuterClass.internal_static_WidgetCoolDownData_descriptor, new String[] { "IsSuccess", "CoolDownTime", "Id" });
    }
    
    public static final class WidgetCoolDownData extends GeneratedMessageV3 implements WidgetCoolDownDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_SUCCESS_FIELD_NUMBER = 5;
        private boolean isSuccess_;
        public static final int COOL_DOWN_TIME_FIELD_NUMBER = 4;
        private long coolDownTime_;
        public static final int ID_FIELD_NUMBER = 15;
        private int id_;
        private byte memoizedIsInitialized;
        private static final WidgetCoolDownData DEFAULT_INSTANCE;
        private static final Parser<WidgetCoolDownData> PARSER;
        
        private WidgetCoolDownData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WidgetCoolDownData() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WidgetCoolDownData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WidgetCoolDownData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 32: {
                            this.coolDownTime_ = input.readUInt64();
                            continue;
                        }
                        case 40: {
                            this.isSuccess_ = input.readBool();
                            continue;
                        }
                        case 120: {
                            this.id_ = input.readUInt32();
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
            return WidgetCoolDownDataOuterClass.internal_static_WidgetCoolDownData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WidgetCoolDownDataOuterClass.internal_static_WidgetCoolDownData_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetCoolDownData.class, Builder.class);
        }
        
        @Override
        public boolean getIsSuccess() {
            return this.isSuccess_;
        }
        
        @Override
        public long getCoolDownTime() {
            return this.coolDownTime_;
        }
        
        @Override
        public int getId() {
            return this.id_;
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
            if (this.coolDownTime_ != 0L) {
                output.writeUInt64(4, this.coolDownTime_);
            }
            if (this.isSuccess_) {
                output.writeBool(5, this.isSuccess_);
            }
            if (this.id_ != 0) {
                output.writeUInt32(15, this.id_);
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
            if (this.coolDownTime_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(4, this.coolDownTime_);
            }
            if (this.isSuccess_) {
                size += CodedOutputStream.computeBoolSize(5, this.isSuccess_);
            }
            if (this.id_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.id_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WidgetCoolDownData)) {
                return super.equals(obj);
            }
            final WidgetCoolDownData other = (WidgetCoolDownData)obj;
            return this.getIsSuccess() == other.getIsSuccess() && this.getCoolDownTime() == other.getCoolDownTime() && this.getId() == other.getId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashBoolean(this.getIsSuccess());
            hash = 37 * hash + 4;
            hash = 53 * hash + Internal.hashLong(this.getCoolDownTime());
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WidgetCoolDownData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WidgetCoolDownData.PARSER.parseFrom(data);
        }
        
        public static WidgetCoolDownData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetCoolDownData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetCoolDownData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WidgetCoolDownData.PARSER.parseFrom(data);
        }
        
        public static WidgetCoolDownData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetCoolDownData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetCoolDownData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WidgetCoolDownData.PARSER.parseFrom(data);
        }
        
        public static WidgetCoolDownData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetCoolDownData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetCoolDownData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetCoolDownData.PARSER, input);
        }
        
        public static WidgetCoolDownData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetCoolDownData.PARSER, input, extensionRegistry);
        }
        
        public static WidgetCoolDownData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetCoolDownData.PARSER, input);
        }
        
        public static WidgetCoolDownData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetCoolDownData.PARSER, input, extensionRegistry);
        }
        
        public static WidgetCoolDownData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetCoolDownData.PARSER, input);
        }
        
        public static WidgetCoolDownData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetCoolDownData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WidgetCoolDownData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WidgetCoolDownData prototype) {
            return WidgetCoolDownData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WidgetCoolDownData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WidgetCoolDownData getDefaultInstance() {
            return WidgetCoolDownData.DEFAULT_INSTANCE;
        }
        
        public static Parser<WidgetCoolDownData> parser() {
            return WidgetCoolDownData.PARSER;
        }
        
        @Override
        public Parser<WidgetCoolDownData> getParserForType() {
            return WidgetCoolDownData.PARSER;
        }
        
        @Override
        public WidgetCoolDownData getDefaultInstanceForType() {
            return WidgetCoolDownData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WidgetCoolDownData();
            PARSER = new AbstractParser<WidgetCoolDownData>() {
                @Override
                public WidgetCoolDownData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WidgetCoolDownData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WidgetCoolDownDataOrBuilder
        {
            private boolean isSuccess_;
            private long coolDownTime_;
            private int id_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WidgetCoolDownDataOuterClass.internal_static_WidgetCoolDownData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WidgetCoolDownDataOuterClass.internal_static_WidgetCoolDownData_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetCoolDownData.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WidgetCoolDownData.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isSuccess_ = false;
                this.coolDownTime_ = 0L;
                this.id_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WidgetCoolDownDataOuterClass.internal_static_WidgetCoolDownData_descriptor;
            }
            
            @Override
            public WidgetCoolDownData getDefaultInstanceForType() {
                return WidgetCoolDownData.getDefaultInstance();
            }
            
            @Override
            public WidgetCoolDownData build() {
                final WidgetCoolDownData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WidgetCoolDownData buildPartial() {
                final WidgetCoolDownData result = new WidgetCoolDownData(this);
                result.isSuccess_ = this.isSuccess_;
                result.coolDownTime_ = this.coolDownTime_;
                result.id_ = this.id_;
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
                if (other instanceof WidgetCoolDownData) {
                    return this.mergeFrom((WidgetCoolDownData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WidgetCoolDownData other) {
                if (other == WidgetCoolDownData.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsSuccess()) {
                    this.setIsSuccess(other.getIsSuccess());
                }
                if (other.getCoolDownTime() != 0L) {
                    this.setCoolDownTime(other.getCoolDownTime());
                }
                if (other.getId() != 0) {
                    this.setId(other.getId());
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
                WidgetCoolDownData parsedMessage = null;
                try {
                    parsedMessage = WidgetCoolDownData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WidgetCoolDownData)e.getUnfinishedMessage();
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
            public boolean getIsSuccess() {
                return this.isSuccess_;
            }
            
            public Builder setIsSuccess(final boolean value) {
                this.isSuccess_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsSuccess() {
                this.isSuccess_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getCoolDownTime() {
                return this.coolDownTime_;
            }
            
            public Builder setCoolDownTime(final long value) {
                this.coolDownTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCoolDownTime() {
                this.coolDownTime_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getId() {
                return this.id_;
            }
            
            public Builder setId(final int value) {
                this.id_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearId() {
                this.id_ = 0;
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
    
    public interface WidgetCoolDownDataOrBuilder extends MessageOrBuilder
    {
        boolean getIsSuccess();
        
        long getCoolDownTime();
        
        int getId();
    }
}
