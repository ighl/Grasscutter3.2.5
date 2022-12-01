// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Internal;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ByteString;
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

public final class AbilityStringOuterClass
{
    private static final Descriptors.Descriptor internal_static_AbilityString_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AbilityString_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AbilityStringOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AbilityStringOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0013AbilityString.proto\"6\n\rAbilityString\u0012\r\n\u0003str\u0018\u0001 \u0001(\tH\u0000\u0012\u000e\n\u0004hash\u0018\u0002 \u0001(\rH\u0000B\u0006\n\u0004typeB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AbilityStringOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AbilityString_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AbilityString_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AbilityStringOuterClass.internal_static_AbilityString_descriptor, new String[] { "Str", "Hash", "Type" });
    }
    
    public static final class AbilityString extends GeneratedMessageV3 implements AbilityStringOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int typeCase_;
        private Object type_;
        public static final int STR_FIELD_NUMBER = 1;
        public static final int HASH_FIELD_NUMBER = 2;
        private byte memoizedIsInitialized;
        private static final AbilityString DEFAULT_INSTANCE;
        private static final Parser<AbilityString> PARSER;
        
        private AbilityString(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.typeCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        private AbilityString() {
            this.typeCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AbilityString();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AbilityString(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            final String s = input.readStringRequireUtf8();
                            this.typeCase_ = 1;
                            this.type_ = s;
                            continue;
                        }
                        case 16: {
                            this.typeCase_ = 2;
                            this.type_ = input.readUInt32();
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
            return AbilityStringOuterClass.internal_static_AbilityString_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AbilityStringOuterClass.internal_static_AbilityString_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityString.class, Builder.class);
        }
        
        @Override
        public TypeCase getTypeCase() {
            return TypeCase.forNumber(this.typeCase_);
        }
        
        @Override
        public boolean hasStr() {
            return this.typeCase_ == 1;
        }
        
        @Override
        public String getStr() {
            Object ref = "";
            if (this.typeCase_ == 1) {
                ref = this.type_;
            }
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            if (this.typeCase_ == 1) {
                this.type_ = s;
            }
            return s;
        }
        
        @Override
        public ByteString getStrBytes() {
            Object ref = "";
            if (this.typeCase_ == 1) {
                ref = this.type_;
            }
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                if (this.typeCase_ == 1) {
                    this.type_ = b;
                }
                return b;
            }
            return (ByteString)ref;
        }
        
        @Override
        public boolean hasHash() {
            return this.typeCase_ == 2;
        }
        
        @Override
        public int getHash() {
            if (this.typeCase_ == 2) {
                return (int)this.type_;
            }
            return 0;
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
            if (this.typeCase_ == 1) {
                GeneratedMessageV3.writeString(output, 1, this.type_);
            }
            if (this.typeCase_ == 2) {
                output.writeUInt32(2, (int)this.type_);
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
            if (this.typeCase_ == 1) {
                size += GeneratedMessageV3.computeStringSize(1, this.type_);
            }
            if (this.typeCase_ == 2) {
                size += CodedOutputStream.computeUInt32Size(2, (int)this.type_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbilityString)) {
                return super.equals(obj);
            }
            final AbilityString other = (AbilityString)obj;
            if (!this.getTypeCase().equals(other.getTypeCase())) {
                return false;
            }
            switch (this.typeCase_) {
                case 1: {
                    if (!this.getStr().equals(other.getStr())) {
                        return false;
                    }
                    break;
                }
                case 2: {
                    if (this.getHash() != other.getHash()) {
                        return false;
                    }
                    break;
                }
            }
            return this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            switch (this.typeCase_) {
                case 1: {
                    hash = 37 * hash + 1;
                    hash = 53 * hash + this.getStr().hashCode();
                    break;
                }
                case 2: {
                    hash = 37 * hash + 2;
                    hash = 53 * hash + this.getHash();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AbilityString parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AbilityString.PARSER.parseFrom(data);
        }
        
        public static AbilityString parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityString.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityString parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AbilityString.PARSER.parseFrom(data);
        }
        
        public static AbilityString parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityString.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityString parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AbilityString.PARSER.parseFrom(data);
        }
        
        public static AbilityString parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityString.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityString parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityString.PARSER, input);
        }
        
        public static AbilityString parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityString.PARSER, input, extensionRegistry);
        }
        
        public static AbilityString parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityString.PARSER, input);
        }
        
        public static AbilityString parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityString.PARSER, input, extensionRegistry);
        }
        
        public static AbilityString parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityString.PARSER, input);
        }
        
        public static AbilityString parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityString.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AbilityString.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AbilityString prototype) {
            return AbilityString.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AbilityString.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AbilityString getDefaultInstance() {
            return AbilityString.DEFAULT_INSTANCE;
        }
        
        public static Parser<AbilityString> parser() {
            return AbilityString.PARSER;
        }
        
        @Override
        public Parser<AbilityString> getParserForType() {
            return AbilityString.PARSER;
        }
        
        @Override
        public AbilityString getDefaultInstanceForType() {
            return AbilityString.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AbilityString();
            PARSER = new AbstractParser<AbilityString>() {
                @Override
                public AbilityString parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AbilityString(input, extensionRegistry);
                }
            };
        }
        
        public enum TypeCase implements Internal.EnumLite, InternalOneOfEnum
        {
            STR(1), 
            HASH(2), 
            TYPE_NOT_SET(0);
            
            private final int value;
            
            private TypeCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static TypeCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static TypeCase forNumber(final int value) {
                switch (value) {
                    case 1: {
                        return TypeCase.STR;
                    }
                    case 2: {
                        return TypeCase.HASH;
                    }
                    case 0: {
                        return TypeCase.TYPE_NOT_SET;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            @Override
            public int getNumber() {
                return this.value;
            }
            
            private static /* synthetic */ TypeCase[] value() {
                return new TypeCase[] { TypeCase.STR, TypeCase.HASH, TypeCase.TYPE_NOT_SET };
            }
            
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AbilityStringOrBuilder
        {
            private int typeCase_;
            private Object type_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AbilityStringOuterClass.internal_static_AbilityString_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AbilityStringOuterClass.internal_static_AbilityString_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityString.class, Builder.class);
            }
            
            private Builder() {
                this.typeCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.typeCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AbilityString.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.typeCase_ = 0;
                this.type_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AbilityStringOuterClass.internal_static_AbilityString_descriptor;
            }
            
            @Override
            public AbilityString getDefaultInstanceForType() {
                return AbilityString.getDefaultInstance();
            }
            
            @Override
            public AbilityString build() {
                final AbilityString result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AbilityString buildPartial() {
                final AbilityString result = new AbilityString(this);
                if (this.typeCase_ == 1) {
                    result.type_ = this.type_;
                }
                if (this.typeCase_ == 2) {
                    result.type_ = this.type_;
                }
                result.typeCase_ = this.typeCase_;
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
                if (other instanceof AbilityString) {
                    return this.mergeFrom((AbilityString)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AbilityString other) {
                if (other == AbilityString.getDefaultInstance()) {
                    return this;
                }
                switch (other.getTypeCase()) {
                    case STR: {
                        this.typeCase_ = 1;
                        this.type_ = other.type_;
                        this.onChanged();
                        break;
                    }
                    case HASH: {
                        this.setHash(other.getHash());
                        break;
                    }
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
                AbilityString parsedMessage = null;
                try {
                    parsedMessage = AbilityString.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AbilityString)e.getUnfinishedMessage();
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
            public TypeCase getTypeCase() {
                return TypeCase.forNumber(this.typeCase_);
            }
            
            public Builder clearType() {
                this.typeCase_ = 0;
                this.type_ = null;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasStr() {
                return this.typeCase_ == 1;
            }
            
            @Override
            public String getStr() {
                Object ref = "";
                if (this.typeCase_ == 1) {
                    ref = this.type_;
                }
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    if (this.typeCase_ == 1) {
                        this.type_ = s;
                    }
                    return s;
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getStrBytes() {
                Object ref = "";
                if (this.typeCase_ == 1) {
                    ref = this.type_;
                }
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    if (this.typeCase_ == 1) {
                        this.type_ = b;
                    }
                    return b;
                }
                return (ByteString)ref;
            }
            
            public Builder setStr(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.typeCase_ = 1;
                this.type_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearStr() {
                if (this.typeCase_ == 1) {
                    this.typeCase_ = 0;
                    this.type_ = null;
                    this.onChanged();
                }
                return this;
            }
            
            public Builder setStrBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.typeCase_ = 1;
                this.type_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasHash() {
                return this.typeCase_ == 2;
            }
            
            @Override
            public int getHash() {
                if (this.typeCase_ == 2) {
                    return (int)this.type_;
                }
                return 0;
            }
            
            public Builder setHash(final int value) {
                this.typeCase_ = 2;
                this.type_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearHash() {
                if (this.typeCase_ == 2) {
                    this.typeCase_ = 0;
                    this.type_ = null;
                    this.onChanged();
                }
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
    
    public interface AbilityStringOrBuilder extends MessageOrBuilder
    {
        boolean hasStr();
        
        String getStr();
        
        ByteString getStrBytes();
        
        boolean hasHash();
        
        int getHash();
        
        AbilityString.TypeCase getTypeCase();
    }
}
