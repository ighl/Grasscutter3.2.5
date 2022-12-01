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

public final class WidgetUseAttachAbilityGroupChangeNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_WidgetUseAttachAbilityGroupChangeNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WidgetUseAttachAbilityGroupChangeNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WidgetUseAttachAbilityGroupChangeNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WidgetUseAttachAbilityGroupChangeNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n-WidgetUseAttachAbilityGroupChangeNotify.proto\"Q\n'WidgetUseAttachAbilityGroupChangeNotify\u0012\u0011\n\tis_attach\u0018\u0006 \u0001(\b\u0012\u0013\n\u000bmaterial_id\u0018\u000b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WidgetUseAttachAbilityGroupChangeNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_WidgetUseAttachAbilityGroupChangeNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WidgetUseAttachAbilityGroupChangeNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WidgetUseAttachAbilityGroupChangeNotifyOuterClass.internal_static_WidgetUseAttachAbilityGroupChangeNotify_descriptor, new String[] { "IsAttach", "MaterialId" });
    }
    
    public static final class WidgetUseAttachAbilityGroupChangeNotify extends GeneratedMessageV3 implements WidgetUseAttachAbilityGroupChangeNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_ATTACH_FIELD_NUMBER = 6;
        private boolean isAttach_;
        public static final int MATERIAL_ID_FIELD_NUMBER = 11;
        private int materialId_;
        private byte memoizedIsInitialized;
        private static final WidgetUseAttachAbilityGroupChangeNotify DEFAULT_INSTANCE;
        private static final Parser<WidgetUseAttachAbilityGroupChangeNotify> PARSER;
        
        private WidgetUseAttachAbilityGroupChangeNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WidgetUseAttachAbilityGroupChangeNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WidgetUseAttachAbilityGroupChangeNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WidgetUseAttachAbilityGroupChangeNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.isAttach_ = input.readBool();
                            continue;
                        }
                        case 88: {
                            this.materialId_ = input.readUInt32();
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
            return WidgetUseAttachAbilityGroupChangeNotifyOuterClass.internal_static_WidgetUseAttachAbilityGroupChangeNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WidgetUseAttachAbilityGroupChangeNotifyOuterClass.internal_static_WidgetUseAttachAbilityGroupChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetUseAttachAbilityGroupChangeNotify.class, Builder.class);
        }
        
        @Override
        public boolean getIsAttach() {
            return this.isAttach_;
        }
        
        @Override
        public int getMaterialId() {
            return this.materialId_;
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
            if (this.isAttach_) {
                output.writeBool(6, this.isAttach_);
            }
            if (this.materialId_ != 0) {
                output.writeUInt32(11, this.materialId_);
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
            if (this.isAttach_) {
                size += CodedOutputStream.computeBoolSize(6, this.isAttach_);
            }
            if (this.materialId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.materialId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WidgetUseAttachAbilityGroupChangeNotify)) {
                return super.equals(obj);
            }
            final WidgetUseAttachAbilityGroupChangeNotify other = (WidgetUseAttachAbilityGroupChangeNotify)obj;
            return this.getIsAttach() == other.getIsAttach() && this.getMaterialId() == other.getMaterialId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + Internal.hashBoolean(this.getIsAttach());
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getMaterialId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WidgetUseAttachAbilityGroupChangeNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WidgetUseAttachAbilityGroupChangeNotify.PARSER.parseFrom(data);
        }
        
        public static WidgetUseAttachAbilityGroupChangeNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetUseAttachAbilityGroupChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetUseAttachAbilityGroupChangeNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WidgetUseAttachAbilityGroupChangeNotify.PARSER.parseFrom(data);
        }
        
        public static WidgetUseAttachAbilityGroupChangeNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetUseAttachAbilityGroupChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetUseAttachAbilityGroupChangeNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WidgetUseAttachAbilityGroupChangeNotify.PARSER.parseFrom(data);
        }
        
        public static WidgetUseAttachAbilityGroupChangeNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetUseAttachAbilityGroupChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetUseAttachAbilityGroupChangeNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetUseAttachAbilityGroupChangeNotify.PARSER, input);
        }
        
        public static WidgetUseAttachAbilityGroupChangeNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetUseAttachAbilityGroupChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static WidgetUseAttachAbilityGroupChangeNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetUseAttachAbilityGroupChangeNotify.PARSER, input);
        }
        
        public static WidgetUseAttachAbilityGroupChangeNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetUseAttachAbilityGroupChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static WidgetUseAttachAbilityGroupChangeNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetUseAttachAbilityGroupChangeNotify.PARSER, input);
        }
        
        public static WidgetUseAttachAbilityGroupChangeNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetUseAttachAbilityGroupChangeNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WidgetUseAttachAbilityGroupChangeNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WidgetUseAttachAbilityGroupChangeNotify prototype) {
            return WidgetUseAttachAbilityGroupChangeNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WidgetUseAttachAbilityGroupChangeNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WidgetUseAttachAbilityGroupChangeNotify getDefaultInstance() {
            return WidgetUseAttachAbilityGroupChangeNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<WidgetUseAttachAbilityGroupChangeNotify> parser() {
            return WidgetUseAttachAbilityGroupChangeNotify.PARSER;
        }
        
        @Override
        public Parser<WidgetUseAttachAbilityGroupChangeNotify> getParserForType() {
            return WidgetUseAttachAbilityGroupChangeNotify.PARSER;
        }
        
        @Override
        public WidgetUseAttachAbilityGroupChangeNotify getDefaultInstanceForType() {
            return WidgetUseAttachAbilityGroupChangeNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WidgetUseAttachAbilityGroupChangeNotify();
            PARSER = new AbstractParser<WidgetUseAttachAbilityGroupChangeNotify>() {
                @Override
                public WidgetUseAttachAbilityGroupChangeNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WidgetUseAttachAbilityGroupChangeNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WidgetUseAttachAbilityGroupChangeNotifyOrBuilder
        {
            private boolean isAttach_;
            private int materialId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WidgetUseAttachAbilityGroupChangeNotifyOuterClass.internal_static_WidgetUseAttachAbilityGroupChangeNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WidgetUseAttachAbilityGroupChangeNotifyOuterClass.internal_static_WidgetUseAttachAbilityGroupChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetUseAttachAbilityGroupChangeNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WidgetUseAttachAbilityGroupChangeNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isAttach_ = false;
                this.materialId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WidgetUseAttachAbilityGroupChangeNotifyOuterClass.internal_static_WidgetUseAttachAbilityGroupChangeNotify_descriptor;
            }
            
            @Override
            public WidgetUseAttachAbilityGroupChangeNotify getDefaultInstanceForType() {
                return WidgetUseAttachAbilityGroupChangeNotify.getDefaultInstance();
            }
            
            @Override
            public WidgetUseAttachAbilityGroupChangeNotify build() {
                final WidgetUseAttachAbilityGroupChangeNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WidgetUseAttachAbilityGroupChangeNotify buildPartial() {
                final WidgetUseAttachAbilityGroupChangeNotify result = new WidgetUseAttachAbilityGroupChangeNotify(this);
                result.isAttach_ = this.isAttach_;
                result.materialId_ = this.materialId_;
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
                if (other instanceof WidgetUseAttachAbilityGroupChangeNotify) {
                    return this.mergeFrom((WidgetUseAttachAbilityGroupChangeNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WidgetUseAttachAbilityGroupChangeNotify other) {
                if (other == WidgetUseAttachAbilityGroupChangeNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsAttach()) {
                    this.setIsAttach(other.getIsAttach());
                }
                if (other.getMaterialId() != 0) {
                    this.setMaterialId(other.getMaterialId());
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
                WidgetUseAttachAbilityGroupChangeNotify parsedMessage = null;
                try {
                    parsedMessage = WidgetUseAttachAbilityGroupChangeNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WidgetUseAttachAbilityGroupChangeNotify)e.getUnfinishedMessage();
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
            public boolean getIsAttach() {
                return this.isAttach_;
            }
            
            public Builder setIsAttach(final boolean value) {
                this.isAttach_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsAttach() {
                this.isAttach_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMaterialId() {
                return this.materialId_;
            }
            
            public Builder setMaterialId(final int value) {
                this.materialId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMaterialId() {
                this.materialId_ = 0;
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
    
    public interface WidgetUseAttachAbilityGroupChangeNotifyOrBuilder extends MessageOrBuilder
    {
        boolean getIsAttach();
        
        int getMaterialId();
    }
}
