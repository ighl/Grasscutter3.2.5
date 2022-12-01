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

public final class CanUseSkillNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_CanUseSkillNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CanUseSkillNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CanUseSkillNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CanUseSkillNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017CanUseSkillNotify.proto\"-\n\u0011CanUseSkillNotify\u0012\u0018\n\u0010is_can_use_skill\u0018\u0002 \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CanUseSkillNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_CanUseSkillNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CanUseSkillNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CanUseSkillNotifyOuterClass.internal_static_CanUseSkillNotify_descriptor, new String[] { "IsCanUseSkill" });
    }
    
    public static final class CanUseSkillNotify extends GeneratedMessageV3 implements CanUseSkillNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_CAN_USE_SKILL_FIELD_NUMBER = 2;
        private boolean isCanUseSkill_;
        private byte memoizedIsInitialized;
        private static final CanUseSkillNotify DEFAULT_INSTANCE;
        private static final Parser<CanUseSkillNotify> PARSER;
        
        private CanUseSkillNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CanUseSkillNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CanUseSkillNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CanUseSkillNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.isCanUseSkill_ = input.readBool();
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
            return CanUseSkillNotifyOuterClass.internal_static_CanUseSkillNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CanUseSkillNotifyOuterClass.internal_static_CanUseSkillNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CanUseSkillNotify.class, Builder.class);
        }
        
        @Override
        public boolean getIsCanUseSkill() {
            return this.isCanUseSkill_;
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
            if (this.isCanUseSkill_) {
                output.writeBool(2, this.isCanUseSkill_);
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
            if (this.isCanUseSkill_) {
                size += CodedOutputStream.computeBoolSize(2, this.isCanUseSkill_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CanUseSkillNotify)) {
                return super.equals(obj);
            }
            final CanUseSkillNotify other = (CanUseSkillNotify)obj;
            return this.getIsCanUseSkill() == other.getIsCanUseSkill() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashBoolean(this.getIsCanUseSkill());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CanUseSkillNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CanUseSkillNotify.PARSER.parseFrom(data);
        }
        
        public static CanUseSkillNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CanUseSkillNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CanUseSkillNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CanUseSkillNotify.PARSER.parseFrom(data);
        }
        
        public static CanUseSkillNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CanUseSkillNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CanUseSkillNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CanUseSkillNotify.PARSER.parseFrom(data);
        }
        
        public static CanUseSkillNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CanUseSkillNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CanUseSkillNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CanUseSkillNotify.PARSER, input);
        }
        
        public static CanUseSkillNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CanUseSkillNotify.PARSER, input, extensionRegistry);
        }
        
        public static CanUseSkillNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CanUseSkillNotify.PARSER, input);
        }
        
        public static CanUseSkillNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CanUseSkillNotify.PARSER, input, extensionRegistry);
        }
        
        public static CanUseSkillNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CanUseSkillNotify.PARSER, input);
        }
        
        public static CanUseSkillNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CanUseSkillNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CanUseSkillNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CanUseSkillNotify prototype) {
            return CanUseSkillNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CanUseSkillNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CanUseSkillNotify getDefaultInstance() {
            return CanUseSkillNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<CanUseSkillNotify> parser() {
            return CanUseSkillNotify.PARSER;
        }
        
        @Override
        public Parser<CanUseSkillNotify> getParserForType() {
            return CanUseSkillNotify.PARSER;
        }
        
        @Override
        public CanUseSkillNotify getDefaultInstanceForType() {
            return CanUseSkillNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CanUseSkillNotify();
            PARSER = new AbstractParser<CanUseSkillNotify>() {
                @Override
                public CanUseSkillNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CanUseSkillNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CanUseSkillNotifyOrBuilder
        {
            private boolean isCanUseSkill_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CanUseSkillNotifyOuterClass.internal_static_CanUseSkillNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CanUseSkillNotifyOuterClass.internal_static_CanUseSkillNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(CanUseSkillNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CanUseSkillNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isCanUseSkill_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CanUseSkillNotifyOuterClass.internal_static_CanUseSkillNotify_descriptor;
            }
            
            @Override
            public CanUseSkillNotify getDefaultInstanceForType() {
                return CanUseSkillNotify.getDefaultInstance();
            }
            
            @Override
            public CanUseSkillNotify build() {
                final CanUseSkillNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CanUseSkillNotify buildPartial() {
                final CanUseSkillNotify result = new CanUseSkillNotify(this);
                result.isCanUseSkill_ = this.isCanUseSkill_;
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
                if (other instanceof CanUseSkillNotify) {
                    return this.mergeFrom((CanUseSkillNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CanUseSkillNotify other) {
                if (other == CanUseSkillNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsCanUseSkill()) {
                    this.setIsCanUseSkill(other.getIsCanUseSkill());
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
                CanUseSkillNotify parsedMessage = null;
                try {
                    parsedMessage = CanUseSkillNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CanUseSkillNotify)e.getUnfinishedMessage();
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
            public boolean getIsCanUseSkill() {
                return this.isCanUseSkill_;
            }
            
            public Builder setIsCanUseSkill(final boolean value) {
                this.isCanUseSkill_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsCanUseSkill() {
                this.isCanUseSkill_ = false;
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
    
    public interface CanUseSkillNotifyOrBuilder extends MessageOrBuilder
    {
        boolean getIsCanUseSkill();
    }
}
