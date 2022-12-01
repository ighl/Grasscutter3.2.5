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

public final class DungeonShowReminderNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_DungeonShowReminderNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_DungeonShowReminderNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private DungeonShowReminderNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return DungeonShowReminderNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001fDungeonShowReminderNotify.proto\"0\n\u0019DungeonShowReminderNotify\u0012\u0013\n\u000breminder_id\u0018\t \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        DungeonShowReminderNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_DungeonShowReminderNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_DungeonShowReminderNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(DungeonShowReminderNotifyOuterClass.internal_static_DungeonShowReminderNotify_descriptor, new String[] { "ReminderId" });
    }
    
    public static final class DungeonShowReminderNotify extends GeneratedMessageV3 implements DungeonShowReminderNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int REMINDER_ID_FIELD_NUMBER = 9;
        private int reminderId_;
        private byte memoizedIsInitialized;
        private static final DungeonShowReminderNotify DEFAULT_INSTANCE;
        private static final Parser<DungeonShowReminderNotify> PARSER;
        
        private DungeonShowReminderNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private DungeonShowReminderNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new DungeonShowReminderNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private DungeonShowReminderNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 72: {
                            this.reminderId_ = input.readUInt32();
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
            return DungeonShowReminderNotifyOuterClass.internal_static_DungeonShowReminderNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return DungeonShowReminderNotifyOuterClass.internal_static_DungeonShowReminderNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(DungeonShowReminderNotify.class, Builder.class);
        }
        
        @Override
        public int getReminderId() {
            return this.reminderId_;
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
            if (this.reminderId_ != 0) {
                output.writeUInt32(9, this.reminderId_);
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
            if (this.reminderId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.reminderId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DungeonShowReminderNotify)) {
                return super.equals(obj);
            }
            final DungeonShowReminderNotify other = (DungeonShowReminderNotify)obj;
            return this.getReminderId() == other.getReminderId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getReminderId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static DungeonShowReminderNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return DungeonShowReminderNotify.PARSER.parseFrom(data);
        }
        
        public static DungeonShowReminderNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DungeonShowReminderNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DungeonShowReminderNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return DungeonShowReminderNotify.PARSER.parseFrom(data);
        }
        
        public static DungeonShowReminderNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DungeonShowReminderNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DungeonShowReminderNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return DungeonShowReminderNotify.PARSER.parseFrom(data);
        }
        
        public static DungeonShowReminderNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DungeonShowReminderNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DungeonShowReminderNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonShowReminderNotify.PARSER, input);
        }
        
        public static DungeonShowReminderNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonShowReminderNotify.PARSER, input, extensionRegistry);
        }
        
        public static DungeonShowReminderNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DungeonShowReminderNotify.PARSER, input);
        }
        
        public static DungeonShowReminderNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DungeonShowReminderNotify.PARSER, input, extensionRegistry);
        }
        
        public static DungeonShowReminderNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonShowReminderNotify.PARSER, input);
        }
        
        public static DungeonShowReminderNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonShowReminderNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return DungeonShowReminderNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final DungeonShowReminderNotify prototype) {
            return DungeonShowReminderNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == DungeonShowReminderNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static DungeonShowReminderNotify getDefaultInstance() {
            return DungeonShowReminderNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<DungeonShowReminderNotify> parser() {
            return DungeonShowReminderNotify.PARSER;
        }
        
        @Override
        public Parser<DungeonShowReminderNotify> getParserForType() {
            return DungeonShowReminderNotify.PARSER;
        }
        
        @Override
        public DungeonShowReminderNotify getDefaultInstanceForType() {
            return DungeonShowReminderNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new DungeonShowReminderNotify();
            PARSER = new AbstractParser<DungeonShowReminderNotify>() {
                @Override
                public DungeonShowReminderNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new DungeonShowReminderNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DungeonShowReminderNotifyOrBuilder
        {
            private int reminderId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return DungeonShowReminderNotifyOuterClass.internal_static_DungeonShowReminderNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return DungeonShowReminderNotifyOuterClass.internal_static_DungeonShowReminderNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(DungeonShowReminderNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (DungeonShowReminderNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.reminderId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return DungeonShowReminderNotifyOuterClass.internal_static_DungeonShowReminderNotify_descriptor;
            }
            
            @Override
            public DungeonShowReminderNotify getDefaultInstanceForType() {
                return DungeonShowReminderNotify.getDefaultInstance();
            }
            
            @Override
            public DungeonShowReminderNotify build() {
                final DungeonShowReminderNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public DungeonShowReminderNotify buildPartial() {
                final DungeonShowReminderNotify result = new DungeonShowReminderNotify(this);
                result.reminderId_ = this.reminderId_;
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
                if (other instanceof DungeonShowReminderNotify) {
                    return this.mergeFrom((DungeonShowReminderNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final DungeonShowReminderNotify other) {
                if (other == DungeonShowReminderNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getReminderId() != 0) {
                    this.setReminderId(other.getReminderId());
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
                DungeonShowReminderNotify parsedMessage = null;
                try {
                    parsedMessage = DungeonShowReminderNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (DungeonShowReminderNotify)e.getUnfinishedMessage();
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
            public int getReminderId() {
                return this.reminderId_;
            }
            
            public Builder setReminderId(final int value) {
                this.reminderId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearReminderId() {
                this.reminderId_ = 0;
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
    
    public interface DungeonShowReminderNotifyOrBuilder extends MessageOrBuilder
    {
        int getReminderId();
    }
}
